organization := "com.github.swagger-spray"

name := "swagger-spray"

EclipseKeys.withSource := true

coverageHighlighting := {
  if (scalaBinaryVersion.value == "2.10") false
  else false
}

scalaVersion := "2.11.8"

checksums in update := Nil

libraryDependencies ++= Seq(
  "io.spray" %% "spray-routing-shapeless23" % "1.3.4",
  "io.spray" %% "spray-testkit" % "1.3.4" % "test",
  "io.spray" %% "spray-json" % "1.3.2",
  "com.typesafe.akka" %% "akka-actor" % "2.4.14",
  "io.swagger" %% "swagger-scala-module" % "1.0.2",
  "io.swagger" % "swagger-core" % "1.5.10",
  "io.swagger" % "swagger-annotations" % "1.5.10",
  "io.swagger" % "swagger-models" % "1.5.10",
  "io.swagger" % "swagger-jaxrs" % "1.5.10",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test" ,
  "org.json4s" %% "json4s-jackson" % "3.2.11" % "test",
  "org.json4s" %% "json4s-native" % "3.2.11" % "test",
  "joda-time" % "joda-time" % "2.8" % "test",
  "org.joda" % "joda-convert" % "1.7" % "test"
)

testOptions in Test += Tests.Argument("-oD")

parallelExecution in Test := false
logBuffered := false

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

parallelExecution in Test := false

homepage := Some(url("https://github.com/matfax/swagger-spray-shapeless23"))

licenses := Seq("The Apache Software License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

releasePublishArtifactsAction := PgpKeys.publishSigned.value
