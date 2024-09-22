package org.example.lesson_4

fun main() {
    print("наличие повреждений корпуса (true/false):")
    val damage = readLine().toBoolean() == true

    print("текущий состав экипажа:")
    val crewNumber = readLine()?.toInt()?: 0

    print("количество ящиков с провизией на борту:")
    val boxesNumber = readLine()?.toInt()?: 0

    print("благоприятность метеоусловий (true/false):")
    val weather = readLine().toBoolean() == true

    val canSwim = !damage && crewNumber in 55..70 && boxesNumber > 50
    val canSwimDamage = crewNumber == 70 && weather == true && boxesNumber >= 50

    val swim = canSwim || canSwimDamage

    println(swim)
}