scalaVersion := "3.9.0"

resolvers += DefaultMavenRepository
resolvers += "Confluent Maven Repo" at "https://packages.confluent.io/maven/"

libraryDependencies ++= {

  val confluentVersion = "8.3.1"

  Seq(
    "io.confluent"                % "kafka-avro-serializer"    % confluentVersion,
    "io.confluent"                % "kafka-streams-avro-serde" % confluentVersion,
  )
}
