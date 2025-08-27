package org.example.lesson4

fun main() {

    val sunnyWeather = true
    val tentIsOpen = true
    val airHumidity = 20
    val seasonNow = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${sunnyWeather && tentIsOpen && airHumidity == 20 && seasonNow != "winter"}")
}