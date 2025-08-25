package org.example.lesson3

fun main() {

    val chessRecord = "D2-D4;0"
    val cellFrom = "${chessRecord[0]}${chessRecord[1]}"
    val cellTo = "${chessRecord[3]}${chessRecord[4]}"
    val moveNumber = "${chessRecord[6]}"

    println(cellFrom)
    println(cellTo)
    println(moveNumber)
}