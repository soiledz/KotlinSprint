package org.example.lesson_5

fun main() {
    val sum = 5 + 2

    val input = readLine()!!.toInt()

    if (sum == input) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}