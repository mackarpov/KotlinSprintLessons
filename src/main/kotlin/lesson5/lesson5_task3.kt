package org.example.lesson5

fun main() {

    println("Угадайте два числа от 0 до 42!")

    print("Введите первое число от 0 до 42: ")
    val firstNumber = readln().toInt()

    print("Введите второе число от 0 до 42: ")
    val secondNumber = readln().toInt()

    if ((firstNumber == FIRST_CORRECT_NUMBER || firstNumber == SECOND_CORRECT_NUMBER) &&
        (secondNumber == SECOND_CORRECT_NUMBER || secondNumber == FIRST_CORRECT_NUMBER)) {
        println("Поздравляем! Вывыиграли главный приз!")
    } else if ((firstNumber == FIRST_CORRECT_NUMBER || firstNumber == SECOND_CORRECT_NUMBER) ||
        (secondNumber == SECOND_CORRECT_NUMBER || secondNumber == FIRST_CORRECT_NUMBER)) {
        println("Вы выиграли утешительный пиз")
    } else {
        println("Неудача!")
    }
    println("Правильные числа: $FIRST_CORRECT_NUMBER и $SECOND_CORRECT_NUMBER")

}

const val FIRST_CORRECT_NUMBER = 7
const val SECOND_CORRECT_NUMBER = 36