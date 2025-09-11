package org.example.lesson7

fun main() {

    val rangeOfDigits = (1..9).shuffled().take(3)
    val rangeOfChars = ('a'..'z').shuffled().take(3)
    var password = ""

    for (i in FIRST_INDEX_IN_RANGE until rangeOfChars.size) {
        password = password + rangeOfChars[i].toString() + rangeOfDigits[i].toString()
    }
    println(password)
}

private const val FIRST_INDEX_IN_RANGE = 0