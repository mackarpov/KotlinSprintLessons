package org.example

fun main() {
    val arrayOfIngredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")
    val intArray1: IntArray = intArrayOf(4, 4, 2)
    val charArray1: CharArray = charArrayOf('4', '4', '2')

//    val intArray2 = arrayOf()
    val intArray3 = intArrayOf(1, 2, 3, 4)

//    println("Размер массива с ингредиентами: ${arrayOfIngredients.size}")
//
//    println(arrayOfIngredients.indexOf("помидор"))

//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[2])

//    arrayOfIngredients[4] = "паприка"
//    println(arrayOfIngredients[4])

    arrayOfIngredients.set(1, "капуста")
//    arrayOfIngredients.get(1) // получаем элемент массива по индексу через get
    println(arrayOfIngredients.get(1))

    for (i in arrayOfIngredients) {
        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }
}