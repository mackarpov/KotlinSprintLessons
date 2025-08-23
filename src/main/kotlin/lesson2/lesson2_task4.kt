package org.example.lesson2

fun main() {

    val buff = 1.2
    val crystalOre = 7
    val ironOre = 11
    val extraCrystalOre = crystalOre * buff - crystalOre
    val extraIronOre = ironOre * buff - ironOre

    println(extraCrystalOre.toInt())
    println(extraIronOre.toInt())
}