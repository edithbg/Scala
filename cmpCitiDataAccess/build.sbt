name := "cmpCitiDataAccess"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions ++= Seq("-target", "1.8", "-source", "1.8")

publishMavenStyle := true

libraryDependencies ++= {
  Seq( //"org.mockito" % "mockito-all" % "2.0.2-beta" % Test


    "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % "test",
    "org.mockito" % "mockito-all" % "1.10.19" % "test", // mockito for tests
    "com.typesafe" % "config" % "1.3.2",
    "postgresql" % "postgresql" % "9.1-901-1.jdbc4",
    "com.github.pureconfig" %% "pureconfig" % "0.9.1",
    "mysql" % "mysql-connector-java" % "5.1.6",

    "org.apache.spark" %% "spark-core" % "2.3.3",
    "org.apache.spark" %% "spark-sql" % "2.3.3",
    "org.apache.spark" %% "spark-hive" % "2.3.3" % "provided"

  )
}