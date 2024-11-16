package lesson1_to_10.lesson_4

//Задача 1 к Уроку 4
//
//На сайте ресторана есть онлайн бронирование. Бронирование доступно, когда есть свободные столики.
//Всего в ресторане 13 столов и их количество всегда неизменно.
//На сегодня забронированы все столики. А на завтра осталось еще 4 свободных.
//
//Напиши программу, которая сообщает информацию о бронировании в момент запроса,
//путем сравнения данных о свободных столах с данными о столах в ресторане.
//
//– Создать переменные с количеством забронированных столов на сегодня и на завтра;
//– Вывести в консоль сообщение о доступности столиков в одном println();
//– Каждое сообщение с новой строки (НЕ использовать многострочный вывод (“”” “””));
//– Формат сообщений такой:
//[Доступность столиков на сегодня: true/false],
//[Доступность столиков на завтра: true/false].

fun main() {
    val totalTables: Int = 13
    val freeTableToday: Int = 0
    val freeTableTomorrow: Int = 4
    var availabilityTable: Boolean
    val textMessageAvailabilityTable: String = "Доступность столиков на"
    val textMessageAvailabilityTableToday: String = "сегодня"
    val textMessageAvailabilityTableTomorrow: String = "завтра"

    availabilityTable = (freeTableToday > 0) && (freeTableToday <= totalTables)
    println("$textMessageAvailabilityTable $textMessageAvailabilityTableToday: $availabilityTable")

    availabilityTable = (freeTableTomorrow > 0) && (freeTableTomorrow <= totalTables)
    println("$textMessageAvailabilityTable $textMessageAvailabilityTableTomorrow: $availabilityTable")
}