package org.example.lesson7

fun main() {

    print("Введите количество знаков в пароле (не меньше $MIN_SIZE_OF_PASSWORD): ")
    val numberOfCharacters = readln().toInt()

    val digitTable = (0..9).shuffled().take(numberOfCharacters)
    val lowercaseLettersTable = ('a'..'z').shuffled().take(numberOfCharacters)
    val capitalLettersTable = ('A'..'Z').shuffled().take(numberOfCharacters)
    val complexPassword =
        (digitTable + lowercaseLettersTable + capitalLettersTable).shuffled().take(numberOfCharacters)
    var finalPassword = ""

    for (i in 0 until complexPassword.size) {
        finalPassword += complexPassword[i]
    }
    println(finalPassword)
}

const val MIN_SIZE_OF_PASSWORD = 6