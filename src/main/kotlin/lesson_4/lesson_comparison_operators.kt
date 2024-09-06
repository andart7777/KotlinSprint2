package lesson_4

fun main() {

    // Операторы сравнения

//    val a = (1 == 1)

    // <, >, >=, <=, ==, !=
    // true
    // false

    // ===, !== (операторы ссылочного сравнения)
    // Результат сравнения будет истинный, если обе переменные ссылаются на один объект или наоборот

    val userAge = 40
//    val comparisonResult: Boolean = false
//    val comparisonResult = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)
//    val comparisonResult = (userAge >= AGE_OF_MAJORITY) && (userAge <= RETIREMENT_AGE)
    val comparisonResult = userAge in AGE_OF_MAJORITY .. RETIREMENT_AGE
    println("Результат сравнения возраста: $comparisonResult")

//    println(0 < -1) // false
//    println(1 == 1) // true
//    println(2 == 3) // false
//    println(7 != 8) // true

    // Логические операторы

    // &&, ||, !

//    val a = true
//    val b = !a
//    println(b)

}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65