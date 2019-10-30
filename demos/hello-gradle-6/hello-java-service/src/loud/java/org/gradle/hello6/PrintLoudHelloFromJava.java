package org.gradle.hello6;

import org.apache.commons.lang3.StringUtils;

public class PrintLoudHelloFromJava {

    public String print(HelloMessage message) {
        var printed = message.getMessage() + " " + """
        from Java 13
            and Gradle 6!""";
        printed = StringUtils.rightPad(printed.toUpperCase(), 100, '!');
        System.out.println(printed);
        return printed;
    }
}
