package lesson_6

//### Задача 2 ###
//
//Создай программу, которая будет запрашивать у пользователя ввод пароля до тех пор, пока он не введет правильный пароль.
//Правильный пароль должен быть задан в программе заранее.

fun main() {
    val userPassword: String = "qwerty"

    do {
        println("Введите пароль: ")
        val readUserPassword = readLine()!!.toString()
        if (readUserPassword == userPassword) {
            println("Верный пароль! Вы вошли в систему!")
        } else {
            println("Неверный пароль, попробуйте еще раз")
        }
    } while (readUserPassword != userPassword)
}