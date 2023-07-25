package com.wsgc.user.persistence

import com.datastax.driver.core.policies.{ConstantReconnectionPolicy, DowngradingConsistencyRetryPolicy}
import com.datastax.driver.core.{Cluster, Session}
import com.typesafe.config.ConfigFactory

/**
  * Singleton to create a connection to a Cassandra instance pointing at the wsi_user_identity keyspace
  */
object UserSession {

  val session: Session = initSession()

  /**
    * Initialize the Cassandra connection and return a Session object
    *
    * @return a DataStax session
    */
  def initSession(): Session = {
    val cassandraConf = ConfigFactory.load("cassandra")
    val contactPoints = cassandraConf.getStringList("cassandra.contactPoints")
    val username = cassandraConf.getString("cassandra.username")
    val password = cassandraConf.getString("cassandra.password")
    val constantDelayMs = cassandraConf.getInt("cassandra.constantDelayMs")
    val userKeySpace = cassandraConf.getString("cassandra.userKeyspace")
    val port = cassandraConf.getInt("cassandra.port")

    val cluster = Cluster.builder()
      .addContactPoints(contactPoints.get(0), contactPoints.get(1), contactPoints.get(2))
      .withPort(port)
      .withCredentials(username, password)
      .withRetryPolicy(DowngradingConsistencyRetryPolicy.INSTANCE)
      .withReconnectionPolicy(new ConstantReconnectionPolicy(constantDelayMs))
      .build()
    return cluster.connect(userKeySpace)
  }
}