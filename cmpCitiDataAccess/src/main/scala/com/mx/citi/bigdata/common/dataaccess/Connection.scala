package com.mx.citi.bigdata.common.dataaccess


import java.sql
import java.sql.DriverManager._
import java.sql.{Connection, DriverManager, SQLException}

import properties.PropertiesBuilder


/*
 *
 **/
trait Connection {
  def getName ( ): String
  def executeQuery(query: String): Unit

}

/*
*
**/

class MysqlConnection extends Connection {



  def executeQuery(query: String): Unit = {
    System.out.println("Executing the query '$query' the MysQL way.")
  }

  override def getName ( ): String = "SimpleMysqlConnection"

}

/*
 *
 **/

class PgSqlConnection extends Connection {

  val properties: PropertiesBuilder = new PropertiesBuilder ()
    .setDriverMysql()
    .setSchemaMysql()
    .setUserMysQL()
    .setpasswordMysQL()

  //System.out.println( s"Properties MySQL: ${properties.schemaMysql} ${properties.userMysQL}. Password: ${properties.passwordMysQL} " )

  println(properties.driverPostgresSQL)
  println(properties.userPostgresSQL)
  println(properties.passwordPostgresSQL)

  println("Postgres connector")
  var connection:sql.Connection = _
  try {
    Class.forName(properties.driverPostgresSQL)
    connection = getConnection(properties.schemaPostgresSQL, properties.userPostgresSQL, properties.passwordPostgresSQL)
    val statement = connection.createStatement
    val rs = statement.executeQuery("SELECT * FROM link")
    while (rs.next) {
      System.out.println ("While -------.")
      val url = rs.getString("url")
      System.out.println ( "link = " + url)
    }
  } catch { case _ => }
  connection.close()

  /*
   *
   **/
  def executeQuery(query: String): Unit = {
    System.out.println("Executing the query '$query' the PgSQL way.")
  }

  /*
   *
   **/
   def getName ( ): String = "SimplePosgreSQLConnection"

}

/*
*
**/
class TeradataConnection extends Connection {

  val properties: PropertiesBuilder = new PropertiesBuilder ()
    .setDriverTerada()
    .setSchemaTeradata()
    .setUserTeradata()
    .setpasswordTeradata()

  //System.out.println( s"Properties Teradata : ${properties.schemaTeradata} ${properties.userTeradata}. Password: ${properties.passwordTeradata}." )

  def executeQuery(query: String): Unit = {
    System.out.println("Executing the query '$query' Teradata way.")
  }
  override def getName ( ): String = "SimpleMysqlConnection"
}
