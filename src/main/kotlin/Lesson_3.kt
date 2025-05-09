package org.example

fun main() {
    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"

    // конкатенация строк
    println(greeting + "!" + space + "What is your main question?")
    println(greeting + ", " + userName + "!" + space + "What is your main question?")

    // интерполяция строк
    println("$greeting, $userName! What is your main question?")
    println("To which you can respond ${40 + 2}")

    // многострочный вывод
    val multiString = """
                    aaaaaa
               bbbbbb
                        cccc
    """.trimIndent() // убирает минимальный отступ (bbbbbb) в каждой строке
    println(multiString)

    val multiString2 = """
                    aaaaaa
               bbbbbb
                        cccc
    """//.trimIndent() // отступы в каждой строке остаются
    println(multiString2)

    val multiString3 = """
                    |aaaaaa
               |bbbbbb
                        |cccc
    """.trimMargin() // удалены отступы, строки прижаты к левому краю
    println(multiString3)

    val phrase = "And he said - \"it is magnificent!\""
    println(phrase)
}