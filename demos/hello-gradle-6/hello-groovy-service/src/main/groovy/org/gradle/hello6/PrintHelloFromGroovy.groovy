package org.gradle.hello6;

interface PrintHelloFromGroovy {

    PrintHelloFromGroovy INSTANCE = new PrintHelloFromGroovyImpl();

    String print(HelloMessage message);
}
