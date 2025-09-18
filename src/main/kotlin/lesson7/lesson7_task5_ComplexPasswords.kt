package org.example.lesson7

fun main() {

    var amountOfCharacters: Int

    do {
        print("Введите количество знаков в пароле (не меньше $MIN_SIZE_OF_PASSWORD): ")
        amountOfCharacters = readln().toInt()

        if (amountOfCharacters < MIN_SIZE_OF_PASSWORD) {
            println("Ваш пароль меньше $MIN_SIZE_OF_PASSWORD символов, пропробуйте еще раз.")
        }
    } while (amountOfCharacters < MIN_SIZE_OF_PASSWORD)

    val digitTable = 0..9
    val lowercaseLettersTable = 'a'..'z'
    val capitalLettersTable = 'A'..'Z'
    var complexPassword: String = digitTable.random().toString() +
            lowercaseLettersTable.random() + capitalLettersTable.random()

    while (true) {
        if (complexPassword.length < amountOfCharacters) {
            complexPassword += digitTable.random().toString()
        } else {
            break
        }

        if (complexPassword.length < amountOfCharacters) {
            complexPassword += lowercaseLettersTable.random()
        } else {
            break
        }

        if (complexPassword.length < amountOfCharacters) {
            complexPassword += capitalLettersTable.random()
        } else {
            break
        }
    }
    println(complexPassword)
}

const val MIN_SIZE_OF_PASSWORD = 6