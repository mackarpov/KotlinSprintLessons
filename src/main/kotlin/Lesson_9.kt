package org.example

fun main() {
    // List - упорядоченный набор элементов, может менять размер
    // Set - множество - неупорядоченный набор уникальных элементов.
    // Map - словарь: ключ - значение, ключи - уникальные

    // Array - фиксированный размер, изменить размер можно только создав его копию
    // List - add, remove
    // Array<T> - класс, быстрые
    // List<T> - интерфейс, медленные

    val list1: List<Int> = listOf(4, 4, 2) // неизменяемый список
    val list2: MutableList<Int> = mutableListOf(1, 2, 3) // изменяемый список

    val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
    mutableList.add(42)
    println(mutableList)

    mutableList.add(0, 42)
    println(mutableList)

    println(mutableList.contains(42))

    println(mutableList.isEmpty())
    println(mutableList.isNotEmpty())

    println(mutableList.indexOf(42))
    println(mutableList.lastIndexOf(42))

    mutableList.sort() // сортировать по возрастанию
    mutableList.sortDescending() // сортировать по убыванию
    mutableList.reverse() // изменить порядок элементов на противоположный
    println(mutableList)

    println("------------------------------------------------")

    mutableList.forEach {number ->
        println(number)
    }

    // интервал -> for
    // коллекция -> forEach
    // break, continue -> for

    println("------------------------------------------------")

    val mutableList2 = mutableList.filter {
        it == 42
    }

    mutableList2.forEach { println(it) }

    println("------------------------------------------------")

    val mutableList3 = mutableList2.map {
        it * 2
    }

    mutableList3.forEach { println(it) }
}