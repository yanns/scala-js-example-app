// Turn this project into a Scala.js project by importing these settings
scalaJSSettings

name := "Example"

version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.scalarx" % "scalarx_2.10" % "0.2.3-JS",
  "org.scalajs" %% "scalajs-pickling" % "0.2",
  "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test"
)
