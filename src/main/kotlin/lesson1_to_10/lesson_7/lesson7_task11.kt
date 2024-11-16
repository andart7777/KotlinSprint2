package lesson1_to_10.lesson_7

//### Задача 11 ###
//Напиши программу, которая будет выводить все четные числа от 1 до 100.

fun main() {
    val rangeNumber = 1..100

    // first option
    for (i in rangeNumber) {
        if (i % 2 != 0) continue
        else println(i)
    }

    // second option
    val rangeNumber2 = 1..100 step 2

    // first option
    for (i in rangeNumber) {
        println("Вариант 2 - $i")
    }

    // third option
    val evenNumbers: List<Int> = (1..100).filter { it % 2 == 0 }
    println(evenNumbers)
}