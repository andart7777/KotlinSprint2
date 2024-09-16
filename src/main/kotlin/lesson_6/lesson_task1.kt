package lesson_6

//### Задача 1 ###
//
//Напиши программу, которая будет запрашивать у пользователя ввод чисел до тех пор, пока он не введет отрицательное число.
//После этого программа должна вывести сумму всех введенных положительных чисел.

fun main() {
    var sumReadNumber = 0

    do {
        println("Введите произвольные положительные и отрицательные числа: ")
        val readNumber = readLine()!!.toInt()
        if (readNumber >= 0) {
            sumReadNumber += readNumber
        }
    } while (readNumber >= 0)

    println("Сумма всех введенных положительных чисел: $sumReadNumber")

}