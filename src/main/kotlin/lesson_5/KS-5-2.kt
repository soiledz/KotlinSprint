package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите ваш год рождения: ")
    val birthYear = readln().toIntOrNull()

    if (birthYear != null) {
        val currentYear = 2024
        val age = currentYear - birthYear


        if (AGE_OF_MAJORITY <= age) {
            println("Показывать экран со скрытым контентом")
        } else {
            println("Вернуться на главный экран")
        }
    }
}