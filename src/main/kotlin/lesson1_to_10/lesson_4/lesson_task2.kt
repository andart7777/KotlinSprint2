package lesson1_to_10.lesson_4

//Задача 2 к Уроку 4
//
//При работе на таможенном терминале важно точно определить категорию каждого груза.
//Напиши программу, которая проверяет, соответствует ли груз категории "Average".
//Эта категория имеет следующие параметры: вес от 35 кг (не включительно) до 100 кг (включительно),
//и объем меньше 100 литров (не включительно).
//
//Создай программу, которая отображает соответствие данных груза категории "Average".
//Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false".
//
//- укажи предварительно заданные параметры категории;
//- проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
//- сделай сравнение непосредственно внутри println() и без использования диапазонов.

fun main() {
    val minWeight: Int = 35
    val maxWeight: Int = 100
    val maxVolume: Int = 100


    val cargoOneWeight = 20
    val cargoOneVolume = 80

    println("Груз с весом $cargoOneWeight кг и объемом $cargoOneVolume л соответствует категории 'Average': " +
            "${(cargoOneWeight > minWeight) && (cargoOneWeight <= maxWeight) && (cargoOneVolume < maxVolume)}")

    val cargoTwoWeight = 50
    val cargoTwoVolume = 100

    println("Груз с весом $cargoTwoWeight кг и объемом $cargoTwoVolume л соответствует категории 'Average': " +
            "${(cargoTwoWeight > minWeight) && (cargoTwoWeight <= maxWeight) && (cargoTwoVolume < maxVolume)}")
}