plugins {
    `java-library`
    scala
}

scala {
    zincVersion.set("1.3.1")
}

dependencies {
    api(platform(project(":platform")))

    api(project(":data"))

    implementation("org.scala-lang:scala-library:2.13.1")
}