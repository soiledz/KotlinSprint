package org.example.lesson_2

fun main() {
    val studentInClassroom = 4
    val scoreFirstStudent: Float = 3.0F
    val scoreSecondStudent: Float = 4.0F
    val scoreThirdStudent: Float = 3.0F
    val scoreFourthStudent: Float = 5.0F

    val averageScore: Float = (scoreFirstStudent + scoreSecondStudent + scoreThirdStudent + scoreFourthStudent) / studentInClassroom

    val printFormattedAverageScore = String.format("%.2f", averageScore)

     println(printFormattedAverageScore)
}