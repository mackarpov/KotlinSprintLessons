package org.example.lesson4

fun main() {

    var shipHasDamages: Boolean
    var amountOfCrewOnBoard: Int
    var amountOfProvisions: Int
    var goodWeather: Boolean

    print("Наличие повреждений у корабля (true || false): ")
    shipHasDamages = readln().toBoolean()

    print("Состав экипажа (количество): ")
    amountOfCrewOnBoard = readln().toInt()

    print("Ящики с провизией (количество): ")
    amountOfProvisions = readln().toInt()

    print("Погода благоприятная? (true || false): ")
    goodWeather = readln().toBoolean()

    val result =
        ("${
            ((shipHasDamages == false &&
                    amountOfCrewOnBoard in MINIMUM_CREW..MAXIMUM_CREW &&
                    amountOfProvisions > MINIMUM_PROVISIONS &&
                    (goodWeather == true || goodWeather == false)) ||
                    (shipHasDamages == true &&
                            amountOfCrewOnBoard == MAXIMUM_CREW &&
                            amountOfProvisions >= MINIMUM_PROVISIONS &&
                            goodWeather == true))
        }")

    println("Корабль может приступить к долгосрочному плаванию: $result")
}

const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70
const val MINIMUM_PROVISIONS = 50