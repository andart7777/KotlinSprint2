package lesson_5

//Задача 4 к Уроку 5
//
//Космический корабль "Heart of Gold" верифицирует каждого входящего пассажира с помощью логина и пароля.
//Вас встречает параноидальный робот-андройд Марвин.
//
//Внимание, пассажир. Моя обязанность, как обычно, незавидная,
//- приветствовать вас на борту корабля "Heart of Gold". [вздыхает...]
//Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
//Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...]
//Да, вперед, пожалуйста, вводите свои данные...
//
//У вас есть зарегистрированный бортовой пользователь с именем "Zaphod" и паролем "PanGalactic".
//Этот пользователь имеет доступ к управлению кораблем и может осуществлять навигацию по вселенной.
//
//Бортовой робот-андроид Марвин печально запрашивает имя пользователя для входа в систему.
//Система должна проверить, зарегистрирован ли пользователь.
//Если нет, то система должна предложить пользователю зарегистрироваться и закончить процесс тут (завершить программу).
//
//Если же пользователь уже зарегистрирован, система должна проверить пароль.
//При успешной авторизации система должна вывести приветственное сообщение.
//
//[вздыхает...] Ваши данные проверены, и о, чудо, они верны...
//Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно...
//Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...]
//Надеюсь, вам понравится пребывание здесь больше, чем мне.

fun main() {
    val userLogin: String = "Zaphod"
    val userPassword: String = "PanGalactic"

    println("Введите Ваш логин: ")
    val readUserLogin = readLine()!!.toString()

    if (readUserLogin == userLogin) {
        println("Пользователь $readUserLogin найден!")
        println("Введите Ваш пароль: ")
        val readUserPassword = readLine()!!.toString()

        if (readUserPassword == userPassword) {
            println("Вы вошли в систему!")
        } else {
            println("Пароль не верный")
        }

    } else {
        println(
            """
            |Пользователь $readUserLogin не найден
            |Зарегистрируйтесь!
        """.trimMargin()
        )
        println("Введите Ваш логин: ")
        val readLoginNewUser = readLine()!!.toString()
        println("Введите Ваш пароль: ")
        val readPasswordNewUser = readLine()!!.toString()
        println(
            """
            |Новый пользователь $readLoginNewUser зарегистрирован в системе
            |Ваш логин: $readLoginNewUser 
            |Ваш пароль: $readPasswordNewUser 
        """.trimMargin()
        )

    }
}