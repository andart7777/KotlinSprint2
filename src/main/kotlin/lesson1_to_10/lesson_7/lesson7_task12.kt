package lesson1_to_10.lesson_7

//### Задача 12 ###
//Создай программу, которая будет выводить все буквы английского алфавита в верхнем регистре.

fun main() {

    // Вариант 1
    val rangeChar: CharRange = ('a'..'z')
    println(rangeChar.forEach { println(it.toUpperCase()) })

    // Вариант 2
    for (char in rangeChar) {
        val charToUpperCase = char.toUpperCase()
        println(charToUpperCase)
    }
}