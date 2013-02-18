scala-night
===========
Introduction to Scala (2013-02-25)

1. Download Scala IDE: http://typesafe.com/stack/downloads/scala-ide
2. Download this project as Zip file, and extract it where you want
3. Create C:\Users\user\.sbt\plugins\plugins.sbt
4. Add following line to plugins.sbt<br>
   <code>addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")</code>
5. Run this command in the project folder to create an Eclipse project:<br>
   <code>sbt eclipse</code>
6. Import project to Scala IDE
