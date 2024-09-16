package lesson_5

fun main() {

//    IF..ELSE
    print("Введите возраст: ")
    val userAge = readLine()!!.toInt()
//    if (userAge >= AGE_OF_MAJORITY) {
//        println("Вход разрешен")
//    } else if(userAge == 16 || userAge == 17){
//        println("Вход ограниченный")
//    } else {
//        println("Вход запрещен")
//    }

    // Конструкция if..else может возвращать какие-то значения (через присваивание в переменную)

//    val resultText = if(userAge >= AGE_OF_MAJORITY) "Вход разрешен"
//    else if(userAge == 16 || userAge == 17) "Вход ограничен"
//    else "Вход запрещен"
//
//    println(resultText)

    // WHEN
//    when (userAge) {
//        10 -> println("Вы ввели $userAge")
//        40 -> println("Вы ввели $userAge")
//        100 -> println("Вы ввели $userAge")
//        else -> println("Ввели другое число")
//    }
    // Возвращаемые значения (через присваивание в переменную)
    val resultText2 = when (userAge) {
        10 -> {
            println("Дополнительное действие")
            "Вы ввели $userAge"
        }
        40 -> "Вы ввели $userAge"
        100 -> "Вы ввели $userAge"
        else -> "Ввели другое число"
    }
    println(resultText2)

}
const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65