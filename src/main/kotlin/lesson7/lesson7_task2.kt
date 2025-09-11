package org.example.lesson7

fun main() {

    do {
        val authorizationCode = (1000..9999).shuffled()[0]
        println("Ваш код авторизации: $authorizationCode")

        print("Введите код авторизации: ")
        val userCode = readln().toInt()

    } while (userCode != authorizationCode)
    println("Вы авторизировались!")
}