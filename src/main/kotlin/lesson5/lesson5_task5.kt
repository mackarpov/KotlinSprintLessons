package org.example.lesson5

import kotlin.random.Random

fun main() {

    val userListOfNumbers = mutableListOf<Int>()
    val mysteriousNumbers = IntArray(3) { Random.nextInt(43) }.asList()

    println("Для победы вам надо угадать три числа в диапазоне от 0 до 42")

    for (i in 1..3){
        print("Введите $i-е число в диапазоне от 0 до 42: ")
        userListOfNumbers.add(readln().toInt())
    }

    val matchingNumbers = userListOfNumbers.intersect(mysteriousNumbers)
    val amountOfMatchingNumbers = matchingNumbers.size

    when (amountOfMatchingNumbers) {
        3 -> println("Вы угадали все числа и выиграли джекпот!!!")
        2 -> println("Вы угадали два числа и выиграли крупный приз!!")
        1 -> println("Вы угадали одно число, вы получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа.")
    }

    println("Магические числа:")
    mysteriousNumbers.forEach { number ->
        print("$number ")
    }
}