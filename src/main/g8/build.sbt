name := "$name$"

version := "0.1.0"

scalaVersion := "2.10.3"

resolvers ++= Seq(
  "IESL Release" at "https://dev-iesl.cs.umass.edu/nexus/content/groups/public",
  "Wolfe Release" at "http://homeniscient.cs.ucl.ac.uk:8081/nexus/content/repositories/releases",
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

libraryDependencies ++= Seq(
  "ml.wolfe" %% "wolfe" % "0.1.0"
)