package org.example.lesson5

fun main() {

    print("Для авторизации сложите два числа: 22 и 33. Введите ответ: ")

    val userAnswer = readln().toInt()

    if (userAnswer == CORRECT_ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}

const val CORRECT_ANSWER = 55