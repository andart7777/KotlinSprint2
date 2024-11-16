package lesson1_to_10.lesson_7

fun main() {

    val range1: IntRange = 42..442
    val range2: IntRange = 42 until 442 // until - не включает последнее значение
    val range3: LongRange = 42L..442L
    val rangeChar: CharRange = 'a'..'z'
    val range5: ClosedRange<Double> = 42.1..442.1 // Диапазон с плавающей точкой не поддерживает итерацию
    val range6: ClosedRange<Float> = 42.1f..442.1f // Диапазон с плавающей точкой не поддерживает итерацию
    val range7: IntProgression = 42..442 step 2
    val range8: IntProgression = 442 downTo 42 step 2

    val a = 52 in range1
    val b = 52 !in range1

//    println(a)
//    println(b)

    // break - останавливает цикл
    // continue - завершает данную итерацию (цикл, круг)
    // return - оператор перехода return - завершает выполнение функции в которой она находиться ( в данном примере main() )

    for (i in 5 downTo 1) {
        if (i == 3) {
            println("Пользователь нажал на кнопку \"Пропустить\"")
            continue
        }
        println("Осталось $i секунд")
        Thread.sleep(500)
    }

//    for (i in range1 step 100) {
//        println(i)
//    }

//    for (char in rangeChar) {
//        println(char)
//    }
}