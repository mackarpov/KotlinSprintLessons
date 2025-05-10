package org.example

fun main() {
    val userAge = readln().toInt() //Ввод числа с клавиатуры и перевод его в тип Int

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show special content"
    } else if (userAge == 16 || userAge == 17){
        "Show limited content"
    } else {
        "Back to main screen"
    }
//    println(resultText)

    val consoleNumber =  when(userAge){
        10 -> {
            println("Additional action")
            "Your number is 10"}
        20 -> "Your number is 20"
        42 -> "Your number is 42"
        else -> "Another number"
    }
    println(consoleNumber)
}

 const val AGE_OF_MAJORITY = 18