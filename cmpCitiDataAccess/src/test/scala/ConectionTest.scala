
import com.mx.citi.bigdata.common.dataaccess._
import org.scalatest._

import scala.language.postfixOps


object ConectionTest  extends FlatSpec with Matchers {

  def main(args: Array[String]): Unit = {
   // val clientMySql: DatabaseClient = new DatabaseClient(new MySqlFactory)
    val clientPgSql: DatabaseClient = new DatabaseClient(new PgSqlFactory)
    val clientTeradata: DatabaseClient  = new DatabaseClient(new TeradataFactory)
    //clientMySql.executeQuery("SELECT * FROM users")
    clientPgSql.executeQuery("SELECT * FROM employees")
  }
}
