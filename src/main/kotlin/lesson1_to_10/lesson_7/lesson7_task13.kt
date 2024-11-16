package lesson1_to_10.lesson_7

//### Задача 13 ###
//Напиши программу, которая будет выводить все элементы массива строк в обратном порядке.

fun main() {
    val array = arrayOf("Andrew", "Bob", "Caroline", "Diana", "Elisabet")

    // #1
    for (name in array.size - 1 downTo 0) println(array[name])

    // #2
    array.reversed().forEach { println(it) }
}