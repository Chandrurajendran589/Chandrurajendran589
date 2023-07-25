package com.wsgc.user.persistence

import java.util.UUID

import com.wsgc.action.persistence.ActionDAO;
import com.wsgc.profile.persistence.ProfileDAO
import com.wsgc.user.persistence.UserDAO.{deleteUser, getProfileId}
import scala.collection.mutable.ListBuffer
import util.Random

/**
  * Utility methods for managing test users.
  */
object UserUtility {

  /**
    * Create a set of users using data pulled from the specified data file.
    *
    * @param dataFile file containing a list of users and their metadata
    */
  def createUsers(dataFile: String): Unit = {
    // create profile test users
    val authorities = new java.util.HashSet[String]()
    authorities.add("ROLE_FULLY_AUTHENTICATED")
    authorities.add("ROLE_USER")
    val bufferedSource = scala.io.Source.fromFile(dataFile)
    for (line <- bufferedSource.getLines()) {
      val cols = line.split(",").map(_.trim)
      if (cols(0) != "email") {
        var profileId = UUID.randomUUID()
        UserDAO.createUser(cols(0), authorities, cols(2), cols(1), profileId, Boolean.box(true), Boolean.box(true))
      }
    }
  }

    /**
    * Create a set of users and action codes using the data pulled from the specified data file.
    *
    * @param dataFile file containing a list of users and their metadata
    * @return a list of action codes
    */
  def createUsersWithActionCode(numberOfUsers:Int, dataFile: String, action: String, clientId: String, isUserConfirmed: Boolean): List[String] = {
    // create profile test users
    val authorities = new java.util.HashSet[String]()
    authorities.add("ROLE_FULLY_AUTHENTICATED")
    authorities.add("ROLE_USER")
    val bufferedSource = scala.io.Source.fromFile(dataFile)
    var actionCodes = new ListBuffer[String]
    println("Creating " + numberOfUsers + " users ...")
    println("Test Client Id:  " + clientId)

    var userCount = 0
    for (line <- bufferedSource.getLines()) {
      val cols = line.split(",").map(_.trim)
      if (cols(0) != "email" && (userCount < numberOfUsers)) {
        var profileId = UUID.randomUUID()
        var actionCode = randomCodeGenerator.apply(12).toUpperCase()
        UserDAO.createUser(cols(0), authorities, cols(2), cols(1), profileId, isUserConfirmed, Boolean.box(true))
        ActionDAO.createActionCode(clientId, action, actionCode, profileId)
        actionCodes += actionCode
        userCount += 1
      }
    }
     return actionCodes.toList
  }

  object randomCodeGenerator {
  def apply(length: Int = 12) = {
    Random.alphanumeric.take(length).mkString("")
  }
}
  
  /**
    * Create a set of users using data pulled from the pre-authenticated user's data file.
    *
    * @param dataFile file containing a list of pre-authenticated users and their metadata
    */
  def createPreauthenticatedUsers(dataFile: String): Unit = {
    // create profile test users
    val authorities = new java.util.HashSet[String]()
    authorities.add("ROLE_FULLY_AUTHENTICATED")
    authorities.add("ROLE_USER")
    val bufferedSource = scala.io.Source.fromFile(dataFile)
    for (line <- bufferedSource.getLines().drop(1)) {
      val cols = line.split(",").map(_.trim)
        UserDAO.createPreauthenticatedUser(cols(0), authorities, cols(2), cols(1), UUID.fromString(cols(5)), Boolean.box(true), Boolean.box(true), cols(4))
    }
  }

  /**
    * Create a set of users using data pulled from the specified data file, including profile id.
    *
    * @param dataFile file containing a list of users and their metadata
    */
  def createUsersWithProfileId(dataFile: String): Unit = {
    // create profile test users
    val authorities = new java.util.HashSet[String]()
    authorities.add("ROLE_FULLY_AUTHENTICATED")
    authorities.add("ROLE_USER")
    val bufferedSource = scala.io.Source.fromFile(dataFile)
    for (line <- bufferedSource.getLines()) {
      val cols = line.split(",").map(_.trim)
      if (cols(0) != "email") {
        var profileId = UUID.fromString(cols(4))
        UserDAO.createUser(cols(0), authorities, cols(2), cols(1), profileId, Boolean.box(true), Boolean.box(true))
      }
    }
  }

  /**
    * Create a set of users with associated profiles using data pulled from the specified data file, including profile id.
    *
    * @param dataFile file containing a list of users and their metadata
    */
  def createUsersWithEmptyProfiles(dataFile: String): Unit = {
    val authorities = new java.util.HashSet[String]()
    authorities.add("ROLE_FULLY_AUTHENTICATED")
    authorities.add("ROLE_USER")
    val bufferedSource = scala.io.Source.fromFile(dataFile)
    for (line <- bufferedSource.getLines()) {
      val cols = line.split(",").map(_.trim)
      if (cols(0) != "email") {
        var profileId = UUID.fromString(cols(4))
        UserDAO.createUser(cols(0), authorities, cols(2), cols(1), profileId, Boolean.box(true), Boolean.box(true))
        ProfileDAO.createEmptyProfile(profileId)
      }
    }
  }

  /**
    * Add a link to a set of users.
    *
    * @param dataFile     file containing a list of users and their metadata
    * @param identityType determines the type of link to add
    */
  def linkUsers(dataFile: String, identityType: String): Unit = {
    val authorities = new java.util.HashSet[String]()
    authorities.add("ROLE_FULLY_AUTHENTICATED")
    authorities.add("ROLE_USER")
    val bufferedSource = scala.io.Source.fromFile(dataFile)
    for (line <- bufferedSource.getLines()) {
      val cols = line.split(",").map(_.trim)
      if (cols(0) != "email") {
        var profileId = UUID.fromString(cols(4))
        UserDAO.linkUser(cols(0), identityType, authorities, Boolean.box(true), cols(2), Boolean.box(true), profileId)
      }
    }
    bufferedSource.close()
  }

  /**
    * Delete all of the users in the specified data file.
    *
    * @param dataFile file containing test users
    */
  def deleteUsers(dataFile: String): Unit = {
    val bufferedSource = scala.io.Source.fromFile(dataFile)
    for (line <- bufferedSource.getLines) {
      val cols = line.split(",").map(_.trim)
      if (cols(0) != "email") {
        var profileId: UUID = getProfileId(cols(0))
        if (profileId != null) {
          deleteUser(cols(0), profileId)
          ProfileDAO.deleteProfile(profileId)
        }
      }
    }
    bufferedSource.close
  }
}
