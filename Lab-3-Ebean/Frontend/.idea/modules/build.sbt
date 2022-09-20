name := "client"
 
version := "1.0" 
      
lazy val `client` = (project in file(".")).enablePlugins(PlayScala)

      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq( jdbc , cache , ws , specs2 % Test )
      