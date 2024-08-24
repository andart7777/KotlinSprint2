package lesson_2

fun main() {

    var crystalMineral: Float = 7.00f
    var ironMineral: Float = 11.00f
    var percentOfBaff: Float = 20.00f

    var crystalMineralsProfitPercentage: Int = (crystalMineral * (percentOfBaff / 100)).toInt()
    var ironMineralsProfitPercentage: Int = (ironMineral * (percentOfBaff / 100)).toInt()

    println("Ваш бафф составляет:")
    println("Кристалы: +$crystalMineralsProfitPercentage")
    println("Железной руды: +$ironMineralsProfitPercentage")
}