package com.wsgc.user.persistence

import java.time.Instant
import java.util
import java.util.{Date, UUID}

/**
  * Data Access Object singleton to interact with user related tables
  */
object UserDAO {

  /**
    * Delete all user related information for the specified user
    *
    * @param username  user's username
    * @param profileId user's profile id
    */
  def deleteUser(username: String, profileId: UUID): Unit = {
    UserSession.session.execute("delete from users_by_id where id = ?", profileId)
    UserSession.session.execute("delete from locked_users where username = ?", username)
    UserSession.session.execute("delete from users where username = ?", username)
  }

  /**
    * Create a user by populating a record in the users table and the users_by_id table
    *
    * @param username    user's e-mail address
    * @param authorities roles/authorities defining allows actions
    * @param displayName user's display name
    * @param password    user's bcrypt encoded password
    * @param profileId   UUID link to user's profile
    */
  def createUser(username: String, authorities: java.util.Set[String], displayName: String, password: String, profileId: UUID, confirmed: Boolean, enabled: Boolean): Unit = {
    var profileIds: java.util.List[UUID] = new util.ArrayList[UUID]()
    profileIds.add(profileId)
    UserSession.session.execute("insert into users (username, identity_type, authorities, confirmed, display_name, enabled, identifier, profile_id, create_date, mod_date) values (?,?,?,?,?,?,?,?,?,?)",
      username, "password", authorities, Boolean.box(confirmed), displayName, Boolean.box(enabled), password, profileIds, Date.from(Instant.now), Date.from(Instant.now))
    createUserById(profileId, username);
  }

  /**
    * Create a user by populating a record in the users table and the users_by_id table for a pre-authenticated user.
    *
    * @param username    user's e-mail address
    * @param authorities roles/authorities defining allows actions
    * @param displayName user's display name
    * @param password    user's bcrypt encoded password
    * @param profileId   UUID link to user's profile
    * @param confirmed   user's confirmed status (true/false)
    * @param enabled     user's enabled status
    * @param identifier  identifier field for a pre-authenticated user
    */
  def createPreauthenticatedUser(username: String, authorities: java.util.Set[String], displayName: String, password: String, profileId: UUID, confirmed: Boolean, enabled: Boolean, identifier: String): Unit = {
    var profileIds: java.util.List[UUID] = new util.ArrayList[UUID]()
    profileIds.add(profileId)
    UserSession.session.execute("insert into users (username, identity_type, authorities, confirmed, display_name, enabled, identifier, profile_id, create_date, mod_date) values (?,?,?,?,?,?,?,?,?,?)",
      username, "preauth", authorities, Boolean.box(confirmed), displayName, Boolean.box(enabled), identifier, profileIds, Date.from(Instant.now), Date.from(Instant.now))
    createUserById(profileId, username);
  }

  /**
    * Create a record in the users_by_id table.
    *
    * @param id       UUID link
    * @param username user's e-mail address
    */
  def createUserById(id: UUID, username: String): Unit = {
    UserSession.session.execute("insert into users_by_id (id, username, modified_time) values (?,?,?)",
      id, username, Date.from(Instant.now))
  }

  /**
    * Create another identity type for an existing user.
    *
    * @param username     user's e-mail address
    * @param identityType the identity type to link
    */
  def linkUser(username: String, identityType: String, authorities: java.util.Set[String], confirmed: Boolean, displayName: String, enabled: Boolean, profileId: UUID): Unit = {
    var profileIds: java.util.List[UUID] = new util.ArrayList[UUID]()
    profileIds.add(profileId)
    val now = Date.from(Instant.now)
    var linkId = UUID.randomUUID()
    UserSession.session.execute("UPDATE users SET identifier = ?, create_date = ?, mod_date = ?, authorities = ?, confirmed = ?, display_name = ?, enabled = ?, profile_id = profile_id + ? where username = ? and identity_type = ?",
      linkId.toString, now, now, authorities, Boolean.box(confirmed), displayName, Boolean.box(enabled), profileIds, username, identityType)
    createUserById(linkId, username)
  }

  /**
    * Retrieve a user's profile id given a username
    *
    * @param username username to be used to look up the profile id
    * @return the user's profile id or null if the user is not found
    */
  def getProfileId(username: String): UUID = {
    val resultSet = UserSession.session.execute("select profile_id from users where username = ?", username)
    if (resultSet != null && !resultSet.isExhausted()) {
      return resultSet.one().getList(0, UUID.randomUUID().getClass).get(0)
    }
    return null
  }
}