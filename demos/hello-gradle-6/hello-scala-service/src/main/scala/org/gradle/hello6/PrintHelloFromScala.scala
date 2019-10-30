package org.gradle.hello6

class PrintHelloFromScala {
  def print(message: HelloMessage): String = {
    val printed = message.getMessage + " from Scala and Gradle 6!"
    System.out.println(printed)
    printed
  }
}
