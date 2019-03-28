package properties

import com.typesafe.config.ConfigFactory

class PropertiesBuilder {

  val config = ConfigFactory.load()
  var driverMysql = config.getString ( "databaseMySQL.driver" )
  var schemaMysql = config.getString ( "databaseMySQL.schema" )
  var userMysQL = config.getString ( "databaseMySQL.user" )
  var passwordMysQL = config.getString ( "databaseMySQL.password" )

  var driverPostgresSQL = config.getString ( "databasePostgresSQL.driver" )
  var schemaPostgresSQL = config.getString ( "databasePostgresSQL.schema" )
  var userPostgresSQL = config.getString ( "databasePostgresSQL.user" )
  var passwordPostgresSQL = config.getString ( "databasePostgresSQL.password" )


  var driverTeradata = config.getString ( "databaseTeradata.driver" )
  var schemaTeradata = config.getString ( "databaseTeradata.schema" )
  var userTeradata = config.getString ( "databaseTeradata.user" )
  var passwordTeradata = config.getString ( "databaseTeradata.password" )


  //println(s"driverTeradata $driverTeradata")
  //println(s"shemaTeradata $schemaTeradata")
  //println(s"passwordTeradata $userTeradata")
  //println(s"passwordTeradata $passwordTeradata")


  // Teradata


  def setDriverTerada() : PropertiesBuilder = {
    this.driverTeradata = driverTeradata
    this
  }

  def setSchemaTeradata(): PropertiesBuilder = {
    this.schemaTeradata = schemaTeradata
    this
  }

  def setUserTeradata(): PropertiesBuilder = {
    this.userTeradata = userTeradata
    this
  }

  def setpasswordTeradata(): PropertiesBuilder = {
    this.passwordTeradata = passwordTeradata
    this
  }


  // MySQL

  def setDriverMysql(): PropertiesBuilder = {
    this.driverMysql = driverMysql
    this
  }

  def setSchemaMysql(): PropertiesBuilder = {
    this.schemaMysql = schemaMysql
    this
  }

  def setUserMysQL(): PropertiesBuilder = {
    this.userMysQL = userMysQL
    this
  }

  def setpasswordMysQL(): PropertiesBuilder = {
    this.passwordMysQL = passwordMysQL
    this
  }

  // PostgreSQL

  def setDriverPostgresSQL(): PropertiesBuilder = {
    this.driverPostgresSQL = driverPostgresSQL
    this
  }

  def setSchemaPostgresSQL(): PropertiesBuilder = {
    this.schemaPostgresSQL = schemaPostgresSQL
    this
  }

  def setUserPostgresSQL(): PropertiesBuilder = {
    this.userPostgresSQL = userPostgresSQL
    this
  }

  def setpasswordPostgresSQL(): PropertiesBuilder = {
    this.passwordPostgresSQL = passwordPostgresSQL
    this
  }


}