package org.example

fun main() {
    printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName(): String? = readLine()

fun getAge(): Int? = readLine()?.toInt()

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Данные пользователя: $userName, $userAge лет")
}