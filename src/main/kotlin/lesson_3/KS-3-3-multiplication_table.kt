package org.example.lesson_3

fun main() {
    val factor = 4

    println((1..9).joinToString("\n") {"$factor x $it = ${factor * it}"})

}