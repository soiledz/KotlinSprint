package org.example.lesson_4

const val TABLE: Int = 13

fun main() {
    val reservedToDay = 13
    val reservedTomorrow = 9

    val toDay = reservedToDay < TABLE
    val tomorrow = reservedTomorrow < TABLE

    println("Доступность столиков на сегодня: $toDay\nДоступность столиков на сегодня: $tomorrow")
}