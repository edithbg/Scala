package com.mx.citi.bigdata.common.dataaccess


trait DatabaseConnectorFactory {

  def connect(): Connection

}

class MySqlFactory extends DatabaseConnectorFactory {
  override def connect(): Connection = new MysqlConnection
}


class PgSqlFactory extends DatabaseConnectorFactory {
  override def connect(): Connection = new PgSqlConnection
}

class TeradataFactory extends DatabaseConnectorFactory {
  override def connect(): TeradataFactory = new T
}