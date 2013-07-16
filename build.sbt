name := "euler"

scalaVersion := "2.10.2"

resolvers ++= Seq(
  "Java.net Maven2 Repository"     at "http://download.java.net/maven/2/",
  "Sonatype scala-tools repo"      at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Sonatype scala-tools releases"  at "https://oss.sonatype.org/content/repositories/releases",
  "Sonatype scala-tools snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

{
  libraryDependencies ++= Seq(
  "org.scalaj"              %% "scalaj-time"       % "0.7"                   % "compile",
  "org.specs2"              %% "specs2"            % "1.14"                  % "test"
  )
}

unmanagedSourceDirectories in Compile <<= (scalaSource in Compile)(Seq(_))

unmanagedSourceDirectories in Test <<= (scalaSource in Test)(Seq(_))

EclipseKeys.withSource := true

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

