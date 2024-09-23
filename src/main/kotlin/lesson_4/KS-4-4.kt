package org.example.lesson_4

fun main() {
    val thisDay: Int = 5

    val armsAbs = thisDay % 2 != 0
    val legsBack = thisDay % 2 == 0

    println("""
        Упражнения для рук:       $armsAbs
        Упражнения для ног:       $legsBack
        Упражнения для спины:     $legsBack
        Упражнения для пресса:    $armsAbs
    """.trimIndent())

}