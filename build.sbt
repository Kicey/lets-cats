val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "lets-cats",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "org.scalactic" %% "scalactic" % "3.2.17",
      "org.typelevel" %% "cats-core" % "2.10.0",
      "org.scalatest" %% "scalatest" % "3.2.17" % "test",
      "org.scalatest" %% "scalatest-flatspec" % "3.2.17" % "test",
    )
  )
