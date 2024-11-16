package lesson1_to_10.lesson_5

import kotlin.random.Random

//Задача 5* к Уроку 5
//
//Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42.
//Пользователь вводит числа через консоль.
//
//Требования к программе:
//
//- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
//- Поочередно введенные пользователем числа должны также храниться в списке.
//- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции в отдельную переменную.
//
//В зависимости от количества угаданных чисел программа выводит результат:
//
//- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
//- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
//- Если угадано одно число, пользователю выплачивается утешительный приз.
//- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
//- В конце игры вне зависимости от результата программа выводит выигрышные числа.

fun main() {
    val randomWinningNumber = IntArray(3)
    val userNumber = ArrayList<Int>()

    for (i in randomWinningNumber.indices) {
        randomWinningNumber[i] = Random.nextInt(0, 43)
    }

    for (i in 0 until 3) {
        println("Введите число: ")
        val number = readLine()!!.toInt()
        userNumber.add(number)
    }

    val winningList = randomWinningNumber.toList()
    val userList = userNumber.toList()
    val intersection = winningList.intersect(userList)
    val matchCount = intersection.size

    println("Вы угадали $matchCount чисел(а): $intersection")
    println("Выигрышные числа: ${winningList.joinToString(", ")}")
}