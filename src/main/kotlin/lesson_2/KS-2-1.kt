package org.example.lesson_2

fun main() {
    val human = 4
    val a: Float = 3.0F
    val b: Float = 4.0F
    val c: Float = 3.0F
    val d: Float = 5.0F

    val average: Float = (a + b + c + d) / human

    val formattedNumber = String.format("%.2f", average)

     println(formattedNumber)
}