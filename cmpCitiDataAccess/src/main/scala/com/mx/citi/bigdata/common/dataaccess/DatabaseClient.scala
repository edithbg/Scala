package com.mx.citi.bigdata.common.dataaccess


import com.mx.citi.bigdata.common.dataaccess.Connection


class DatabaseClient(connectorFactory: DatabaseConnectorFactory) {

  def executeQuery(query: String): Unit = {
    val connection = connectorFactory.connect()
    connection.executeQuery(query)
  }
}
