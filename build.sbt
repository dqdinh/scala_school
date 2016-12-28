lazy val root = (project in file(".")).
  settings(
    name := "scala_school",
    version := "1.0",
    scalaVersion := "2.11.8",
    initialCommands in (Test, console) := """ammonite.Main().run()""",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "pprint" % "0.4.3",
      "com.lihaoyi" % "ammonite" % "0.8.1" % "test" cross CrossVersion.full,
      "com.twitter" %% "finagle-core" % "6.39.0",
      "com.twitter" %% "finagle-http" % "6.39.0",
      "com.twitter" %% "finagle-memcached" % "6.39.0",
      "com.twitter" %% "bijection-core" % "0.9.2",
      "com.twitter" %% "bijection-util" % "0.9.2",
      "org.scala-lang" % "scala-reflect" % "2.11.8",
      "org.scalacheck" %% "scalacheck" % "1.12.1" % "test",
      "org.scalatest" %% "scalatest" % "2.2.6" % "test",
      "org.mockito" % "mockito-core" % "1.10.19" % "test"
    )
  )
