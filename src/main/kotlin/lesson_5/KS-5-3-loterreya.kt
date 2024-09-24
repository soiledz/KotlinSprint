package org.example.lesson_5

fun main() {
    val winNumber1 = 10
    val winNumber2 = 17

    print("Введите первое число от 0 до 42: ")
    val number1 = readLine()?.toIntOrNull()

    print("Введите второе число от 0 до 42: ")
    val number2 = readLine()?.toIntOrNull()

    val isFirstNumberCorrect = (number1 == winNumber1 || number1 == winNumber2)
    val isSecondNumberCorrect = (number2 == winNumber1 || number2 == winNumber2)

    if (isFirstNumberCorrect && isSecondNumberCorrect) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (isFirstNumberCorrect || isSecondNumberCorrect) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Выигрышные числа были: $winNumber1 и $winNumber2")
}