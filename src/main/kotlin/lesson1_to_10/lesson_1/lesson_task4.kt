package lesson1_to_10.lesson_1

//    Byte	8	-128	127
//    Short	16	-32768	32767
//    Int	32	-2,147,483,648 (-231)	2,147,483,647 (231 - 1)
//    Long	64	-9,223,372,036,854,775,808 (-263)	9,223,372,036,854,775,807 (263 - 1)

fun main() {
    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    println("Расстояние: $length")
    println("Возраст: $age")
    println("Часть дня: $partOfDay")
    println("Секунды: $seconds")
    println("Часть года: $partOfYear")
    println("Апогей орбиты: $apogee")
}