package org.example.lesson_1

fun main(){
    val yearFly = 1961
    var hour = 9
    var minute = 7

    val time = String.format("%4d\n%02d\n%02d", yearFly, hour, minute)
    println(time)

    hour = 10
    minute = 55

    val timeLanding = String.format("%02d:%02d", hour, minute)

    print(timeLanding)
}