libraryDependencies ++= Seq(
    "com.github.siasia" %% "xsbt-web-plugin" % "0.12.0-0.2.11.1"
)

resolvers ++= Seq(
    "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
    Classpaths.typesafeResolver,
    "jgit-repo" at "http://download.eclipse.org/jgit/maven",
    "Twitter Repo" at "http://maven.twttr.com/"
)

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.0-SNAPSHOT")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.5.0")

addSbtPlugin("com.twitter" % "sbt-package-dist" % "1.1.0")
