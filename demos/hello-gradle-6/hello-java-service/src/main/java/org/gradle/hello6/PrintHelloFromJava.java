package org.gradle.hello6;

import com.google.common.base.Strings;

public class PrintHelloFromJava {

    public String print(HelloMessage message) {
        var printed = Strings.nullToEmpty(message.getMessage()) + " " + """
         from Java 13
             and Gradle 6!""";
        System.out.println(printed);
        return printed;
    }
}
