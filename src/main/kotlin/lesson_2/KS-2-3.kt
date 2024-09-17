package org.example.lesson_2

fun main() {
    val checkOutTimeHours: Int = 9
    val checkOutTimeMinutes: Int = 39
    val travelTime: Int = 457

    val travelHours: Int = travelTime / 60
    val travelMinutes: Int = travelTime - (travelHours * 60)

    val arrivalHours = ((checkOutTimeMinutes + travelMinutes) / 60) + checkOutTimeHours + travelHours
    val arrivalMinutes = (checkOutTimeMinutes + travelMinutes) % 60

    val arrivalTime = String.format("%02d:%02d", arrivalHours, arrivalMinutes)

    println(arrivalTime)
}