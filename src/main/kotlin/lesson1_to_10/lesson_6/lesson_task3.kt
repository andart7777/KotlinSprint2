package lesson1_to_10.lesson_6

//### Задача 3 ###
//
//Напиши программу, которая будет запрашивать у пользователя ввод чисел до тех пор, пока он не введет число, кратное 5.
//После этого программа должна вывести количество введенных чисел.

fun main() {
    val arrayUserNumber = ArrayList<Int>()

    do {
        println("Введите число: ")
        val readUserNumber = readLine()!!.toInt()
        arrayUserNumber.add(readUserNumber)
    } while (readUserNumber % 5 != 0)

    println("Количество введенных чисел ${arrayUserNumber.size}")

}