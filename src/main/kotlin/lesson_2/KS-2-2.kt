package org.example.lesson_2

fun main() {
    val worker = 50
    val intern = 30
    val workerCash = 30000
    val internCash = 20000

    val totalCash = (worker * workerCash) + (intern * internCash)
    val allPeople = worker + intern
    val averageCash = totalCash / allPeople

    println(totalCash)
    println(allPeople)
    println(averageCash)
}