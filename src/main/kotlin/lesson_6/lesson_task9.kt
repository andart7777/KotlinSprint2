package lesson_6

//### Задача 9 ###
//
//Напиши программу, которая будет запрашивать у пользователя ввод строк до тех пор, пока он не введет строку,
//содержащую хотя бы одну цифру.
//После этого программа должна вывести количество введенных строк.


fun main() {
    val arrayInputString = ArrayList<String>()
    var containsDigit = false

    do {
        println("Введите слово: ")
        var inputString = readLine()!!.toString()
        arrayInputString.add(inputString)

        for (char in inputString) {
            if (char.isDigit()) {
                containsDigit = true
                break
            }
        }
    } while (!containsDigit)
    println("Всего элементов в списке: ${arrayInputString.size}")
}