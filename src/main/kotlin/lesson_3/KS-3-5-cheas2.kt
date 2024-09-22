package org.example.lesson_3

fun main() {
    val dataMove = "D2-D4;0"

    val (move, moveNumber) = dataMove.split(";")
    val (moveFrom, moveTo) = move.split("-")

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}