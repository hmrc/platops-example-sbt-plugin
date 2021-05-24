lazy val project = Project("platops-example-sbt-plugin", file("."))
  .settings(
    majorVersion  := 0,
    sbtPlugin     := true,
    isPublicArtefact := true,
    crossSbtVersions := Vector("0.13.18", "1.3.4")
  )
