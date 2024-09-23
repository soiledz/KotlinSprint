package org.example.lesson_3

fun main() {
    val dataMove = "D2-D4;0"

    val (moveFrom, moveTo, moveNumber) = dataMove.split("-",";")

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}