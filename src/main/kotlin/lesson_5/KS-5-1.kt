package org.example.lesson_5

fun main() {
    val a = 5
    val b = 2
    val sum = a + b

    println("Докажи что ты человек и реши простой пример: $a + $b")
    val input = readln().toInt()

    if (sum == input) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}