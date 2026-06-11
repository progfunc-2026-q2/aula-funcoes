val scala3Version = "3.3.7"

lazy val root = project
  .in(file("."))
  .settings(
    name := "student-template",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test,
    libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"
  )
