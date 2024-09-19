package org.example.lesson_2

fun main() {
    val PERCENT = 100

    val initialAmount = 70000.0
    val annualInterestRate = 16.7 / PERCENT
    val years = 20

    val finalAmount = initialAmount * Math.pow(1 + annualInterestRate, years.toDouble())

    println(String.format("%.3f", finalAmount))
}