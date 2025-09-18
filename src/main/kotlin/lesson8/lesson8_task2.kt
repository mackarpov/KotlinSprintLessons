package org.example.lesson8

fun main() {

    val arrayOfIngredients = arrayOf("молоко", "бананы", "мороженое", "клубника", "корица")

    print("Какой ингредиент вы хотите найте? ")
    val userIngredient = readln()

    if (userIngredient in arrayOfIngredients) {
        println("Ингредиент [$userIngredient] в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}