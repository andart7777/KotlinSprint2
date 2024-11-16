package lesson1_to_10.lesson_4

//Задача 5* к Уроку 4
//
//Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих условий:
//
//- корабль не имеет повреждений;
//- число экипажа составляет от 55 (включительно) до 70 человек (включительно);
//- на борту есть более 50 ящиков провизии (не включительно);
//- погода благоприятна или неблагоприятна.
//
//Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:
//
//- на борту рекомендованный состав экипажа 70 человек;
//- погода благоприятная;
//- на борту есть 50 и более ящиков провизии.
//
//В качестве входных данных используй информацию, введенную через консоль:
//
//- наличие повреждений корпуса (Boolean переменная);
//- текущий состав экипажа;
//- количество ящиков с провизией на борту;
//- благоприятность метеоусловий (Boolean переменная).
//
//Напиши программу, которая будет определять, может ли корабль отправиться в плавание.
//Программа должна анализировать эти данные и выводить результат в консоль.
//Для анализа должно использоваться единое составное условие, состоящие только из логических операторов.

fun main() {
    val theShipHasNoDamage: Boolean = true
    val numberOfCrew: IntRange = 55..70
    val numberOfBoxesWithProvisions: Int = 50
    val weatherConditions: Boolean = true

    println("Корабль не имеет повреждений? (true/false) : ")
    val damage = readlnOrNull().toBoolean()

    println("Число экипажа? : ")
    val crew = readlnOrNull()!!.toInt()

    println("Какое количество ящиков провизии? : ")
    val boxes = readlnOrNull()!!.toInt()

    println("Благоприятные метеоусловия?: (true/false) ")
    val weather = readlnOrNull()!!.toBoolean()

    println(
        "Можно выходить в море? : " +
                "${
                    (damage == theShipHasNoDamage &&
                            crew in numberOfCrew &&
                            boxes >= numberOfBoxesWithProvisions &&
                            weather == weatherConditions || weather != weatherConditions)
                            ||
                            (damage != theShipHasNoDamage &&
                                    crew == 70 &&
                                    boxes >= numberOfBoxesWithProvisions &&
                                    weather == weatherConditions)
                }"
    )
}