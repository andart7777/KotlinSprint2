package lesson1_to_10.lesson_5

//Задача 3 к Уроку 5
//
//Для алгоритма простого приложения-лотереи, нужно угадать два числа от 0 до 42.
//Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.
//Пользователь должен вводить числа в консоль. Правильные числа заранее известны и хранятся в переменных.
//Оформить ввод текстовыми подсказками о том, что нужно вводить.
//Вывести отдельным сообщением, какие числа были нужны для победы.
//
//- если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”;
//- если угадано только одно число, вывести “Вы выиграли утешительный приз!”;
//- если не угадано ничего, вывести “Неудача!”;
//- программа должна учитывать ввод чисел в обратном порядке.

fun main() {
    val firstWinningNumber = 10
    val secondWinningNumber = 15

    println(
        """ЛОТЕРЕЯ
        |Угадайте два числа в диапазоне от 0 до 42
        | 
    """.trimMargin()
    )

    println("Введите первое число: ")
    val readFirstNumber = readLine()!!.toInt()
    println("Введите второе число: ")
    val readSecondNumber = readLine()!!.toInt()


    if (firstWinningNumber == readFirstNumber && secondWinningNumber == readSecondNumber) {
        println("Поздравляем! Вы выиграли главный приз!")
        println("Вы угадали выигрышные числа: 10 и 15")
    } else if (firstWinningNumber == readSecondNumber && secondWinningNumber == readFirstNumber) {
        println("Поздравляем! Вы выиграли главный приз!")
        println("Вы угадали выигрышные числа: 10 и 15")
    } else if ((firstWinningNumber == readFirstNumber && secondWinningNumber != readSecondNumber) ||
        (firstWinningNumber == readSecondNumber && secondWinningNumber != readFirstNumber)
    ) {
        println("Вы выиграли утешительный приз!")
        if (firstWinningNumber == readFirstNumber && secondWinningNumber != readSecondNumber) {
            println("Вы угадали первое число 10 и не угадали второе число, верное 15")
        } else if (firstWinningNumber == readSecondNumber && secondWinningNumber != readFirstNumber) {
            println("Вы угадали первое число 15 и не угадали второе число, верное 10")
        }
    } else if ((firstWinningNumber != readFirstNumber && secondWinningNumber == readSecondNumber) ||
        (firstWinningNumber != readSecondNumber && secondWinningNumber == readFirstNumber)
    ) {
        println("Вы выиграли утешительный приз!")
        if (firstWinningNumber != readFirstNumber && secondWinningNumber == readSecondNumber) {
            println("Вы угадали первое число 10 и не угадали второе число, верное 15")
        } else if (firstWinningNumber != readSecondNumber && secondWinningNumber == readFirstNumber) {
            println("Вы угадали первое число 15 и не угадали второе число, верное 10")
        }
    } else if (firstWinningNumber != readFirstNumber && secondWinningNumber != readSecondNumber) {
        println("Неудача!")
    }
}