package lesson_6

//### Задача 6 ###
//
//Создай программу, которая будет запрашивать у пользователя ввод чисел до тех пор,
//пока он не введет число, которое уже было введено ранее.
//После этого программа должна вывести все уникальные введенные числа.

fun main() {
    val arrayNumbers = ArrayList<Int>()
    var number: Int

    do {
        println("Введите число: ")
        number = readLine()!!.toInt()
        if (number !in arrayNumbers) {
            arrayNumbers.add(number)
        } else {
            break
        }
    } while (number in arrayNumbers)

    println("number: $number")
    println("array: $arrayNumbers ")
    println("array: ${arrayNumbers.subList(1, arrayNumbers.size).joinToString(", ")} ")
}