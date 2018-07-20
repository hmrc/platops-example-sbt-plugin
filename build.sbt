import uk.gov.hmrc.DefaultBuildSettings._
import uk.gov.hmrc.SbtAutoBuildPlugin
import uk.gov.hmrc.versioning.SbtGitVersioning

val pluginName = "platops-example-sbt-plugin"

lazy val project = Project(pluginName, file("."))
  .enablePlugins(SbtAutoBuildPlugin, SbtGitVersioning, SbtArtifactory)
  .settings(
    majorVersion  := 0,
    sbtPlugin     := true,
    makePublicallyAvailableOnBintray := true,
    targetJvm     := "jvm-1.7",
    scalaVersion  := "2.10.4",
    resolvers     += Resolver.url(
      "sbt-plugin-releases",
      url("https://dl.bintray.com/content/sbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
  )
