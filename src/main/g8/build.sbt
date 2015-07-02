name := "$name$"

version := "$projectVersion$"

scalaVersion := "$scalaVersion$"

resolvers ++= Seq(
  "IESL Release" at "https://dev-iesl.cs.umass.edu/nexus/content/groups/public",
  "Wolfe Release" at "http://homeniscient.cs.ucl.ac.uk:8081/nexus/content/repositories/releases",
  "Wolfe Snapshots" at "http://homeniscient.cs.ucl.ac.uk:8081/nexus/content/repositories/snapshots",
  Resolver.sonatypeRepo("snapshots"),
  Resolver.sonatypeRepo("releases")
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0-M5" cross CrossVersion.full)

libraryDependencies ++= Seq(
  "ml.wolfe" %% "wolfe-core" % "$wolfeVersion$",
  "ml.wolfe" %% "wolfe-examples" % "$wolfeVersion$"
)

initialCommands := """
        import ml.wolfe.Wolfe._
        import ml.wolfe.macros.OptimizedOperators._
"""
