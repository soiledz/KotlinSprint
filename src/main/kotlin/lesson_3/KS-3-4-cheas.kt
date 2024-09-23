package org.example.lesson_3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    var moveString = "$moveFrom-$moveTo;$moveNumber"

    println(moveString)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = 2

    moveString = "$moveFrom-$moveTo;$moveNumber"

    println(moveString)
}