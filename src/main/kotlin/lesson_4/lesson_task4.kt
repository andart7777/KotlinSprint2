package lesson_4

//Задача 4 к Уроку 4
//
//Программа тренировок разбивает упражнения на две группы: упражнения для мышц рук/пресса и ног/спины.
//Она рекомендует делать упражнения на каждую группу мышц через день. Пользователь начал занятия с рук и пресса.
//Напиши программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.
//
//Предположим, что сегодня 5 день тренировок. В первый день выполнялись упражнения для рук и пресса.
//Выведи сообщение в виде нескольких красивых ровных строк.
//
//Вывод должен быть таким:
//
//Упражнения для рук:       true
//Упражнения для ног:       false
//Упражнения для спины:  false
//Упражнения для пресса: true
//
//- все сообщение должно печататься в одном println();
//- при изменении значения переменной дня тренировки на 1 день вперед, вывод должен меняться.

// TODO: Не понятна задача, что нужно сделать
fun main() {
    var dayOfTraining = 5

//    val exercisesForArms = dayOfTraining % 2 == 1
//    val exercisesForLegs = (dayOfTraining++) % 2 == 0
//    val exercisesForBack = (dayOfTraining + 1) % 2 == 0
//    val exercisesForAbs = dayOfTraining % 2 == 1

    println(
        """
        |Упражнения для рук:       ${dayOfTraining % 2 == 1}
        |Упражнения для ног:       ${dayOfTraining % 2 == 0}
        |Упражнения для спины:  ${dayOfTraining % 2 == 0}
        |Упражнения для пресса: ${dayOfTraining % 2 == 1}
    """.trimMargin()
    )
}