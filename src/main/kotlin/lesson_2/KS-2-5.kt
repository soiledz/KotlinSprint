package org.example.lesson_2

const val PECENT = 100.0
const val INTEREST_PERIOD = 1

fun main() {

    val initialAmount = 70000.0
    val annualInterestRate = 16.7
    val years = 20

    val finalAmount = initialAmount * Math.pow(INTEREST_PERIOD + annualInterestRate / PECENT, years.toDouble())

    println(String.format("%.3f", finalAmount))
}