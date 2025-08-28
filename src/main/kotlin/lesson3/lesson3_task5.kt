package org.example.lesson3

fun main() {

    val chessRecord = "D2-D4;0"
    val cellFrom = chessRecord.split('-', ';')[0]
    val cellTo = chessRecord.split('-', ';')[1]
    val moveNumber = chessRecord.split('-', ';')[2]

    println(cellFrom)
    println(cellTo)
    println(moveNumber)
}