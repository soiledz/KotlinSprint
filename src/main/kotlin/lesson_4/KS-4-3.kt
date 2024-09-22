package org.example.lesson_4

fun main() {
    val weatherSun = true
    val awningOpen = true
    val airHumidity: Int = 20
    val timeOfYear: String = "не зима"

    val sun = true
    val openAwning = true
    val humidity: Int = 20
    val currentTimeOfYear: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            (weatherSun == sun && awningOpen == openAwning && airHumidity == humidity && timeOfYear == currentTimeOfYear))
}