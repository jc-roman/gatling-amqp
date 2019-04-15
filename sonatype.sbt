// Your profile name of the sonatype account. The default is the same with the organization value
//sonatypeProfileName := "com.github.jc-roman"

// To sync with Maven central, you need to supply the following information:
publishMavenStyle := true

// License of your choice
licenses := Seq("MIT" -> url("http://opensource.org/licenses/MIT"))


// Where is the source code hosted
import xerial.sbt.Sonatype._

sonatypeProjectHosting := Some(GitHubHosting("jc-roman", "gatling-amqp", ""))

// Add the default sonatype repository setting
publishTo := sonatypePublishTo.value