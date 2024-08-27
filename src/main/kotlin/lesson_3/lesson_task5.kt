package lesson_3

fun main() {

    val receivedMessage: String = "D2-D4;0"

    val splitMessage = receivedMessage.split(";")
    val moveNumber = splitMessage[1]

    val splitPositionChess = splitMessage[0].split("-")
    val startPositionChess = splitPositionChess[0]
    val endPositionChess = splitPositionChess[1]

    println("$startPositionChess-$endPositionChess;$moveNumber")
}