package org.example.lesson_4

fun main() {
    val minWeight = 35
    val maxWeight = 100
    val maxValue = 100

    val cargoWeight1 = 20
    val cargoValue1 = 80
    println("Груз с весом $cargoWeight1 кг и объемом $cargoValue1 л соответствует категории 'Average': " +
            (minWeight < cargoWeight1 && cargoWeight1 <= maxWeight && cargoValue1 < maxValue))

    val cargoWeight2 = 50
    val cargoValue2 = 100
    println("Груз с весом $cargoWeight2 кг и объемом $cargoValue2 л соответствует категории 'Average': " +
            (minWeight < cargoWeight2 && cargoWeight2 <= maxWeight && cargoValue2 < maxValue))
}