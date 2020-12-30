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
    crossSbtVersions := Vector("0.13.18", "1.3.4")
  )
