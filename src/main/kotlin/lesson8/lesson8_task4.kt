package org.example.lesson8

fun main() {

    val arrayOfIngredients = arrayOf("укроп", "киви", "шпинат", "минералка", "манго")

    for (i in arrayOfIngredients) println(i)

    print("Какой ингредиент вы хотите заменить? ")
    val userIngredient = readln()

    if (userIngredient !in arrayOfIngredients) {
        println("Такого ингредиента нет в списке")
        return
    }

    print("Какой ингредиент вы хотите добавить? ")
    val newUserIngredient = readln()
    val indexOfNewIngredient = arrayOfIngredients.indexOf(userIngredient)

    arrayOfIngredients.set(indexOfNewIngredient, newUserIngredient)

    println("Готово! Вы сохранили следующий список:")
    for (i in arrayOfIngredients) println(i)
}