package lesson1_to_10.lesson_3

fun main() {
    var startPositionChess: String
    var endPositionChess: String
    var moveNumber: Int
    var sendMessage: String

    startPositionChess = "E2"
    endPositionChess = "E4"
    moveNumber = 1
    sendMessage = "$startPositionChess-$endPositionChess; $moveNumber"
    println(sendMessage)

    // TODO Возможно нужно выделить букву и цифру хода фигуры в отдельные переменные, тогда можно сделать на цифре ++

    startPositionChess = "D2"
    endPositionChess = "D3"
    moveNumber++
    sendMessage = "$startPositionChess-$endPositionChess; $moveNumber"
    println(sendMessage)
}