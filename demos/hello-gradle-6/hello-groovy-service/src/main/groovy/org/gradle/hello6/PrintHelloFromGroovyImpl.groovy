package org.gradle.hello6

class PrintHelloFromGroovyImpl implements PrintHelloFromGroovy {

    String print(HelloMessage message) {
        def printed = "${message.message} from Groovy 3 and Gradle 6!";
        println printed
        printed
    }
}
