plugins {
    `java-library`
    groovy
}

tasks.withType<GroovyCompile> {
    options.isIncremental = true
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:3.0.0-rc-1")

    api(platform(project(":platform")))

    api(project(":data"))

    testImplementation(testFixtures(project(":data")))

    testImplementation("org.spockframework:spock-core:1.3-groovy-2.5-SNAPSHOT")
}
