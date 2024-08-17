package lesson_1

import javax.sql.rowset.spi.SyncResolver

fun main() {

    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"


    // вариант 1
    println(hour + ":" + minute)
    println("$hour:$minute")

    // вариант 2
    val separate: String = ":"
    println(hour + separate + minute)

    // вариант 3
    print(hour)
    print(separate)
    print(minute)



}