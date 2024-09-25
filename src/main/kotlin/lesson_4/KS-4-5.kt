package org.example.lesson_4

fun main() {
    val crewMin = 55
    val crewMax = 70
    val box = 50
    val initialValue = 0


    print("наличие повреждений корпуса (true/false):")
    val damage = readln().toBoolean() == true

    print("текущий состав экипажа:")
    val crewNumber = readln().toInt() - initialValue

    print("количество ящиков с провизией на борту:")
    val boxesNumber = readln().toInt() - initialValue

    print("благоприятность метеоусловий (true/false):")
    val weather = readln().toBoolean() == true

    val canSwim = !damage && crewNumber in crewMin..crewMax && boxesNumber > box
    val canSwimDamage = crewNumber == crewMax && weather == true && boxesNumber >= box

    val swim = canSwim || canSwimDamage

    println(swim)
}