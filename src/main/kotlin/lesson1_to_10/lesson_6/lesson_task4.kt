package lesson1_to_10.lesson_6

//### Задача 4 ###
//
//Создай программу, которая будет запрашивать у пользователя ввод строк до тех пор, пока он не введет строку "exit".
//После этого программа должна вывести все введенные строки в обратном порядке.

fun main() {
    var arrayUserString = ArrayList<String>()

    do {
        println("Введите любое слово: ")
        var userInputString = readLine()!!.toString()
        userInputString = userInputString.toLowerCase().trim()
        arrayUserString.add(userInputString.toLowerCase().trim())
    } while (userInputString != "exit")

    println(
        """
        Всего введенных слов: ${arrayUserString} 

        Слова в обратном порядке списка: ${arrayUserString.reversed().joinToString(", ")}
        
        """.trimIndent()
    )
}