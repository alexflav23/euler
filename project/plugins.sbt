resolvers ++= Seq(
  "typesafe" at "http://repo.typesafe.com/typesafe/releases/",
  "sbt-plugin-releases2" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/",
  "Jawsy.fi M2 releases" at "http://oss.jawsy.fi/maven2/releases"
)

addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "0.3.0")

addSbtPlugin("fi.jawsy.sbtplugins" %% "sbt-jrebel-plugin" % "0.9.0")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.2")

addSbtPlugin("org.scala-sbt" % "sbt-closure" % "0.1.3")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.2.2")

addSbtPlugin("me.lessis" % "less-sbt" % "0.1.10")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.6")

