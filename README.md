scala-night
===========
Introduction to Scala (2013-02-25)

1. Download and install Scala IDE: http://typesafe.com/stack/downloads/scala-ide
2. Download and install Scala Build Tool (SBT): http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html
3. Configure SBT Eclipse plugin
   - create a file<br>
   <code>C:\Users\user\\.sbt\plugins\plugins.sbt</code>
   - add following line into plugins.sbt<br>
   <code>addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")</code>
4. Download this project as Zip file, and extract it where you want
5. In the scala-night project folder run 'sbt eclipse' command to create an Eclipse project:<br>
   <code>scala-night> <b>sbt eclipse</b></code>
6. Import scala-night project into Scala IDE
   - File -> Import... -> Existing Projects into Workspace
