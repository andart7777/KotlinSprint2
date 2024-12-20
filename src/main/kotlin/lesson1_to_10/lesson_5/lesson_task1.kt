package lesson1_to_10.lesson_5

//Задача 1 к Уроку 5

//Нужно написать часть модуля для авторизации пользователя.
//Для входа в приложение пользователь должен доказать, что он не бот.
//Для этого программа предлагает решить простой математический пример – сложить два числа (сообщить об этом пользователю).
//
//Имитируй эти действия в консоли, путем считывания данных с клавиатуры.
//При успешном решении вход в программу символизируется сообщением “Добро пожаловать!".
//В противном случае вывести сообщение "Доступ запрещен."

fun main() {

    println(
        """Подтвердите что Вы не робот! Сложите два числа.
        | 
    """.trimMargin()
    )

    println("Введите первое число: ")
    val readFirstNumber = readLine()!!.toInt()
    println("Введите второе число: ")
    val readSecondNumber = readLine()!!.toInt()
    println("Введите сумму первого и второго числа: ")
    val resultNumber = readLine()!!.toInt()

    val number = readFirstNumber + readSecondNumber

    if (number == resultNumber) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен")
    }
}