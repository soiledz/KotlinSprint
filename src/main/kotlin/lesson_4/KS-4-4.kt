package org.example.lesson_4

fun main() {
    val thisDay: Int = 4

    val armsAbs = thisDay % 2 != 0

    println("""
        Упражнения для рук:       $armsAbs
        Упражнения для ног:       ${!armsAbs}
        Упражнения для спины:     ${!armsAbs}
        Упражнения для пресса:    $armsAbs
    """.trimIndent())

}