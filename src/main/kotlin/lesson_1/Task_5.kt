package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val secondsInSpace: Short = 6365

    val hour = secondsInSpace / SECONDS_IN_HOUR
    val minute = (secondsInSpace - (hour * SECONDS_IN_HOUR)) / SECONDS_IN_MINUTE
    val second = secondsInSpace % SECONDS_IN_MINUTE

    val timeInSpace = String.format("%02d:%02d:%02d", hour, minute, second)

    println(timeInSpace)
}