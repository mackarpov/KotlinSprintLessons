package org.example.lesson9

fun main() {

    println("Введите $NUMBER_OF_INGREDIENTS ингредиентов вашего меню.")

    val listOfIngredients = mutableListOf<String>()
    var usersIngredient = ""
    var counter = 0

    while (counter < NUMBER_OF_INGREDIENTS) {
        print("Введите ${counter + 1}-й ингредиент: ")
        usersIngredient = readln()

        if (listOfIngredients.contains(usersIngredient)) {
            println("Ингредиент \"$usersIngredient\" уже есть в вашем рецепте. Повторите ввод ингредиента.")
        } else {
            listOfIngredients.add(usersIngredient)
            counter++
        }
    }

    val sortedListOfIngredients = listOfIngredients.sorted().joinToString(", ")
    println(sortedListOfIngredients.replaceFirstChar { it.titlecase() })
}

private const val NUMBER_OF_INGREDIENTS = 5