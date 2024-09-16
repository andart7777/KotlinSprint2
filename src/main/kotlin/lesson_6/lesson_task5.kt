package lesson_6

import kotlin.random.Random

//### Задача 5 ###
//
//Напиши программу, которая будет генерировать случайные числа от 1 до 100 и выводить их на экран до тех пор,
//пока не сгенерируется число больше 90.
//После этого программа должна вывести количество сгенерированных чисел.

fun main() {
//    var arrayRandomNumber = IntArray(100) // { Random.nextInt(0, 101)}
    val arrayRandomNumber = ArrayList<Int>() // { Random.nextInt(0, 101)}
    var number = 0
    var index = 0

    while (number <= 90) {
        number = Random.nextInt(0, 101)
//        arrayRandomNumber[index++] = number
        arrayRandomNumber.add(number)
        index++
        println("## ${arrayRandomNumber.joinToString(", ")}")
    }
}
