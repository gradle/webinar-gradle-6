package org.gradle.hello6

import spock.lang.Specification

class PrintHelloFromGroovySpec extends Specification {

    def "service produces human readable hello message"() {
        given:
        def service = PrintHelloFromGroovy.INSTANCE

        when:
        def result = service.print(HelloMessageFixture.sampleMessage())

        then:
        result == "Hello Webinar audience from Groovy 3 and Gradle 6!"
    }
}