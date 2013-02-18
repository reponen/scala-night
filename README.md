scala-night
===========
Introduction to Scala (2013-02-25)

1. Download Scala IDE: http://typesafe.com/stack/downloads/scala-ide
2. Download this project as Zip file, and extract it where you want
3. Create C:\Users\user\.sbt\plugins\plugins.sbt
4. Add following line to plugins.sbt
   addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")
5. run in the project folder:
   > sbt eclipse
6. Import project to Scala IDE
