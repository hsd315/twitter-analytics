name := """twitter-analytics"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

akkaVersion := "2.3.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test")
