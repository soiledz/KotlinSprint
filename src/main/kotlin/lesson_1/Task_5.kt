package org.example.lesson_1

fun main() {
    val secondsInSpace: Short = 6360
    val hour = secondsInSpace / 3600
    val minute = (secondsInSpace - (hour * 3600)) / 60
    val second = secondsInSpace % 60
    val timeInSpace = String.format("%02d:%02d:%02d", hour, minute, second)

    println(timeInSpace)
}