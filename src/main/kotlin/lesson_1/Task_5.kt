package org.example.lesson_1

fun main() {

    val SECONDS_IN_HOUR = 3600
    val SECONDS_IN_MINUTE = 60

    val secondsInSpace: Short = 6365

    val hour = secondsInSpace / SECONDS_IN_HOUR
    val minute = (secondsInSpace - (hour * SECONDS_IN_HOUR)) / SECONDS_IN_MINUTE
    val second = secondsInSpace % SECONDS_IN_MINUTE

    val timeInSpace = String.format("%02d:%02d:%02d", hour, minute, second)

    println(timeInSpace)
}