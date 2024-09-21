package org.example.lesson_2

const val MINUTES_IN_HOUR: Int = 60

fun main() {

    val checkOutTimeHours: Int = 9
    val checkOutTimeMinutes: Int = 39
    val travelTime: Int = 457

    val travelHours: Int = travelTime / MINUTES_IN_HOUR
    val travelMinutes: Int = travelTime - (travelHours * MINUTES_IN_HOUR)

    val arrivalHours = ((checkOutTimeMinutes + travelMinutes) / MINUTES_IN_HOUR) + checkOutTimeHours + travelHours
    val arrivalMinutes = (checkOutTimeMinutes + travelMinutes) % MINUTES_IN_HOUR

    val arrivalTime = String.format("%02d:%02d", arrivalHours, arrivalMinutes)

    println(arrivalTime)
}