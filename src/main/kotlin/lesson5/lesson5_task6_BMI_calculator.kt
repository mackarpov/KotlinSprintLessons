package org.example.lesson5

import kotlin.math.*

fun main() {

    print("Введите ваш вес (в киллограммах): ")
    val userWeight = readln().toDouble()

    print("Введите ваш рост (в сантиметрах): ")
    val userHeight = readln().toFloat() / CONVERSION_COEFFICIENT

    val indexBMI = userWeight / userHeight.pow(EXPONENT)

    val weightCategory = when{
        indexBMI < 18.5 -> "Недостаточная масса тела"
        indexBMI >= 18.5 && indexBMI < 25 -> "Нормальная масса тела"
        indexBMI >= 25 && indexBMI < 30 ->"Избыточная масса тела"
        else -> "Ожирение"
    }

    println("ИМТ = ${String.format("%.2f", indexBMI)}. $weightCategory")
}

const val EXPONENT = 2
const val CONVERSION_COEFFICIENT = 100