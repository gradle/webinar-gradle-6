plugins {
    id("org.gradle.presentation.asciidoctor")
}

presentation {
    githubUserName.set("gradle")
    githubRepoName.set("webinar-gradle-6")
}

dependencies {
    asciidoctor("org.asciidoctor:asciidoctorj-diagram:1.5.11")
}

tasks {
    asciidoctor {
        requires("asciidoctor-diagram")
    }
}