package lesson1_to_10.lesson_7

//### Задача 15 ###
//Напиши программу, которая будет выводить все ключи и значения из заданной карты (Map).

fun main() {
    // mapOf - ключ значение
    val mapStarWar = mapOf(
        "R2-D2" to " — любимый астромеханик Энакина Скайуокера; смелый и верный друг, больше человек, чем дроид",
        "C-3PO" to " — протокольный дроид, созданный маленьким Энакином в помощь маме. Болтливый приятель Р2-Д2",
        "Droid" to " — один из боевых роботов сепаратистов. Практически исчезли после централизованного отключения",
        "C1-10P" to " — дроид-астромеханник корабля повстанцев «Призрак», ворчливый, но верный друг и помощник"
    )

    for ((name, description) in mapStarWar) {
        println(
            "Имя робота: $name" +
                    " Описание: $description"
        )
    }
}