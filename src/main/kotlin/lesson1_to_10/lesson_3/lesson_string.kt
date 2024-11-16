package lesson1_to_10.lesson_3

fun main() {
    val greetings: String = "Здравствуйте"
    val userName: String = "Бурый медведь"
    val space = ' '

    println(space::class.simpleName)

    // Конкатенация
    println(greetings +space + userName + "!" + space + "Как Ваши дела?")
    // Интерполяция
    println("$greetings $userName! Как Ваши дела?")

    println("Сколько будет 40 + 2 = ${40 + 2}")

    val multiString = """
           |строка 1 $greetings
          |строка 2
        |строка 3 $userName
    """.trimMargin() // Выравнивает строку по символу "|"... trimIndent - выравнивает по минимальному отступу
        println(multiString)

}