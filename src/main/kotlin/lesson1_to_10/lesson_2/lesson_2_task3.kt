package lesson1_to_10.lesson_2

fun main() {

    var trainDepartureTimeHour: Int = 9
    var trainDepartureTimeMinute: Int = 39
    var trainTravelTime: Int = 457

    var fullTrainArrivalTimeInMinute: Int = (trainDepartureTimeHour * 60) + trainDepartureTimeMinute + trainTravelTime

    var arrivalHour: Int = fullTrainArrivalTimeInMinute / 60
    var arrivalMinute: Int = fullTrainArrivalTimeInMinute % 60

    println("Время прибытия поезда: $arrivalHour:$arrivalMinute")
}
