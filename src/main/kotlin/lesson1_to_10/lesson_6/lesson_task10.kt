package lesson1_to_10.lesson_6

//### Задача 10 ###
// TODO
//Создай программу, которая будет запрашивать у пользователя ввод чисел до тех пор, пока он не введет число,
//которое является ?.
//После этого программа должна вывести все введенные числа, которые не являются квадратами целых чисел.

//План:
//Написать функцию, которая принимает число.
//Проверить, является ли квадратный корень числа целым числом.
//Вернуть результат проверки.
//Код:
//
//fun isPerfectSquare(number: Int): Boolean {
//    val sqrt = kotlin.math.sqrt(number.toDouble())
//    return sqrt == sqrt.toInt().toDouble()
//}