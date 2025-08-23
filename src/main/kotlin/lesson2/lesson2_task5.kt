package org.example.lesson2

import kotlin.math.*

fun main() {

    val years = 20
    val interestRate = 16.7
    val depositAmount = 70000
    val totalAmount = depositAmount * (1 + interestRate / 100).pow(years)

    println((totalAmount * 1000).roundToInt() / 1000.0)
}