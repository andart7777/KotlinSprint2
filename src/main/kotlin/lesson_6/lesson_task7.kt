package lesson_6

//### Задача 7 ###
//
//Напиши программу, которая будет запрашивать у пользователя ввод чисел до тех пор, пока сумма введенных чисел не превысит 100.
//После этого программа должна вывести среднее арифметическое всех введенных чисел.

fun main() {
    val arrayNumbers = ArrayList<Float>()
    var sumNumbers: Float = 0f
    var averageSumNumbers: Float = 0f
    var inputNumber: Float

    do {
        print("Введите число: ")
        inputNumber = readLine()!!.toFloat()
        sumNumbers += inputNumber
        if (inputNumber < 100 && sumNumbers < 101) {
            arrayNumbers.add(inputNumber)
        } else {
            break
        }

    } while (sumNumbers < 100)

    for (number in arrayNumbers) {
        averageSumNumbers += number
    }
    averageSumNumbers /= arrayNumbers.size
    println("Sum $sumNumbers")
    println("Average $averageSumNumbers")
    println("Array $arrayNumbers")
    println("Array size ${arrayNumbers.size}")
}