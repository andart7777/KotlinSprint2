package lesson_5

//Задача 2 к Уроку 5
//
//Изменить пример из видео урока. В уроке создавался блок кода, считывающий возраст.
//И если возраст больше или равен 18 лет, показывали экран со скрытым контентом
//(выводили это сообщение в консоль в качестве имитации).
//
//Новое условие:
//– Пользователь должен вводить не возраст, а год рождения;
//– Возраст пользователя высчитывать на основании текущего года;
//– Вычисляемый результат должен сравниваться с константой, в которой хранится возраст совершеннолетия (18);
//– Если год рождения подходит, выводить сообщение “Показать экран со скрытым контентом”.

fun main() {
    val currentYear = 2024

    println("Введите Ваш год рождения: ")
    val userYearOfBirth = readLine()!!.toInt()
    val userAge = currentYear - userYearOfBirth

    if (userAge >= AGE) {
        println("Ваш возраст: $userAge")
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен")
    }

}

const val AGE = 18
