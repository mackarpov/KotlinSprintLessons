package org.example

fun main() {
    // логические типы данных
    // операторы сравнения

    val a = 1 + 1 // оператор присваивания
    val b = (1 == 1) // оператор сравнения

    // <, >, >=, <=, ==, !=, ===, !==
    // true, false
    // &&, ||, !

    val userAge = 19
    val comparisonResult: Boolean = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)
    val result = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE
    println("Result is: $comparisonResult")

    println("====================================================")

    println(0 < -1)
    println(1 == 1)
    println(2 == 3)
    println(7 != 8)

    println("====================================================")

    val c = true
    val d = !c
    println(d)

}

//const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65