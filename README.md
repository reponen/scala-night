scala-night
===========
Introduction to Scala (2013-02-25)

<h3>Setting up the scala environment</h3>

1. Download and install Scala IDE: http://typesafe.com/stack/downloads/scala-ide
2. Download and install Scala Build Tool (SBT): http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html
3. Configure SBT Eclipse plugin
   - create a file<br>
   <code>C:\Users\user\\.sbt\plugins\plugins.sbt</code>
   - add following line into plugins.sbt<br>
   <code>addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")</code>
4. Fork this project or download it has a zip file
   (https://github.com/reponen/scala-night/archive/master.zip) and extract it somewhere.
5. In the new <i>scala-night-master</i> project folder run 'sbt eclipse' command to create an Eclipse project:<br>
   <code>scala-night-master> <b>sbt eclipse</b></code>
6. Import scala-night project into Scala IDE
   - File -> Import... -> Existing Projects into Workspace

<h3>Further Scala info</h3>
- http://docs.scala-lang.org/cheatsheets/
- http://www.scala-lang.org/docu/files/ScalaByExample.pdf
