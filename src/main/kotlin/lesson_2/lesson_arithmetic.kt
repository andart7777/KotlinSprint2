package lesson_2

fun main() {

    val c: Int

    val intNum1: Int = 10

    val numFloat1: Float = 10f
    val numFloat2: Float = 3f
//    println(numFloat1 / numFloat2)

    val numDouble1: Double = 10.0
    val numDouble2: Double = 3.0
//    println(numDouble1 / numDouble2)

    // Остаток от деления
//    println(10 % 3)
//    println(10 % 2)
//    println(100 % 30)

    val sum = intNum1 + numFloat1
//    println(sum)
//    println(sum::class.simpleName) // определение типа переменной

    // Инкремент, декремент

    var counter = 0
    counter = counter + 1
    counter += 1
    counter++

    counter = counter - 1
    counter -= 1
    counter--

    ++counter
    --counter

//    println(counter)

    // Операторы сравнения
    val a = 5
    val b = 7

    println(a > b)
    println(a < b)
    println(a <= b)
    println(a >= b)
    println(a == b)
    println(a != b)
}