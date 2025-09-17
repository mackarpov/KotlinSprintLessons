package org.example.lesson7

fun main() {

    val authorizationCode = (1000..9999).random()
    println("Ваш код авторизации: $authorizationCode")
    var userCode: Int

    do {
        print("Введите код авторизации: ")
        userCode = readln().toInt()
    } while (userCode != authorizationCode)
    println("Вы авторизировались!")
}