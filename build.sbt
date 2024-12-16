enablePlugins(ScriptedPlugin)

ThisBuild / scalaVersion := "2.12.20"
ThisBuild / autoStartServer := false

name := "scala3-seed"

addCommandAlias("test", "g8Test")

scriptedLaunchOpts ++= Seq(
  "-Xms1g",
  "-Xmx1g",
  "-XX:ReservedCodeCacheSize=128m",
  "-Xss2m",
  "-Dfile.encoding=UTF-8",
  "org.slf4j" % "slf4j-simple" % "1.7.36" % Runtime exclude("org.slf4j", "slf4j-nop")
)
