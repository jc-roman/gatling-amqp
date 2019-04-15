enablePlugins(GatlingPlugin)

scalaVersion := "2.12.3"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.7", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

val gatlingVersion = "2.3.0"

// Maven Publishing
// http://www.scala-sbt.org/0.13/docs/Using-Sonatype.html

//publishMavenStyle := true
// just run sbt publish; (or experiment with sbt publishLocal)

version := "0.0.10"
organization := "com.github.jc-roman"
//name := "gatling-amqp"
//description := "Gatling AMQP support"
//homepage := Some(url("https://github.com/maiha/gatling-amqp"))
//licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

pomExtra :=
     <developers>
        <developer>
          <id>maiha</id>
          <name>Kazunori Nishi</name>
          <url>https://github.com/maiha</url>
        </developer>
        <developer>
          <id>LuboVarga</id>
          <name>Ľubomír Varga</name>
          <url>https://github.com/LuboVarga</url>
        </developer>
       <developer>
         <id>SilverXXX</id>
         <name>Flavio Campana</name>
         <url>https://github.com/SilverXXX</url>
       </developer>
       <developer>
         <id>jc-roman</id>
         <name>Juan Carlos Roman</name>
         <url>https://github.com/jc-roman</url>
       </developer>
      </developers>
      <scm>
        <url>https://github.com/jc-roman/gatling-amqp</url>
        <connection>scm:git:git@github.com:jc-roman/gatling-amqp.git</connection>
      </scm>

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion,
  "io.gatling"            % "gatling-test-framework"    % gatlingVersion,
  "com.rabbitmq"          % "amqp-client"               % "5.2.0"
)
