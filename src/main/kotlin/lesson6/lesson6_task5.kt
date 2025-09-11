package org.example.lesson6

fun main() {

    var amountOfAttempts = 3

    println("Для входа в приложение докажите, что Вы не бот!")

    while (amountOfAttempts > 0) {
        val numbersForCase = (MINIMUM_DIGIT..MAXIMUM_DIGIT).shuffled().take(2)
        val firstNumber = numbersForCase[0]
        val secondNumber = numbersForCase[1]

        println("Сложите два числа: $firstNumber и $secondNumber ")
        print("Введите свой ответ: ")
        val userDecision = readln().toInt()

        when (userDecision) {
            firstNumber + secondNumber -> {
                println("Добро пожаловать!")
                return
            }

            else -> {
                amountOfAttempts--
                if (amountOfAttempts == 0) break
                println("Неверно. Попробуйте еще раз")
            }
        }
    }
    println("Доступ запрещен")
}

private const val MINIMUM_DIGIT = 1
private const val MAXIMUM_DIGIT = 9