package lesson_3

fun main() {
    val userName: String = "Андрей"
    var greeting: String
    var message: String

    greeting = "Добрый день"
    message = "$greeting $userName"
    println(message)

    greeting = "Добрый вечер"
    message = "$greeting $userName"
    println(message)
}