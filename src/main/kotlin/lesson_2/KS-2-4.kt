package org.example.lesson_2

fun main() {
    val PERCENT = 100.0

    val baf = 20
    val kristal = 7
    val iron = 11

    val bafKoef = baf / PERCENT

    val kristalBaf = (kristal * bafKoef).toInt()
    val ironBaf = (iron * bafKoef).toInt()

    println(kristalBaf)
    println(ironBaf)
}