package lesson_3

fun main() {
    var numberMultiply: Int
    var message: String

    numberMultiply = 6

    message = """
        $numberMultiply x 1 = ${numberMultiply * 1}
        $numberMultiply x 2 = ${numberMultiply * 2}
        $numberMultiply x 3 = ${numberMultiply * 3}
        $numberMultiply x 4 = ${numberMultiply * 4}
        $numberMultiply x 5 = ${numberMultiply * 5}
        $numberMultiply x 6 = ${numberMultiply * 6}
        $numberMultiply x 7 = ${numberMultiply * 7}
        $numberMultiply x 8 = ${numberMultiply * 8}
        $numberMultiply x 9 = ${numberMultiply * 9}
        $numberMultiply x 10 = ${numberMultiply * 10}        
    """.trimIndent()

    println(message)
}