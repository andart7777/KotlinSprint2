package lesson1_to_10.lesson_9

// Коллекции
// Это группы с переменным количеством элементов (или нулем элементов)
// Как правило объекты имеют единый тип

// List - упорядоченный набор элементов, могут быть дубликаты
// Set - коллекция уникальных элементов
// Map - Словарь (ключ - значение), ключ уникальный

// Отличие от массивов
// 1. Коллекции можно расширять, добавлять и удалять элементы (add, remove)
// 2. Array<T>, List<T>
// 3. Массивы оптимизированы для примитивов, у списков такой оптимизации нет
// 4. Процесс сравнивания элементов с друг другом
// Массив - сравниваются адреса ячеек в памяти
// Список - сравнение самого значения

fun main() {

    // Не изменяемый список - нельзя добавлять, удалять, изменять элементы
    val list1: List<Int> = listOf(1, 2, 3)

    // Изменяемый список
    val list2: MutableList<Int> = mutableListOf(1, 2, 3)
    list2[0] = 2

    // Добавление элементов
    list2.add(24) // добавление в конец
    list2.add(2, 55) // добавление по индексу
    println(list2)
    println(list2.contains(24)) // наличие элемента в списке

    // Проверка на наличие элементов
    println(list2.isEmpty())
    println(list2.isNotEmpty())

    // Индекс элемента если он присутствует в списке
    println(list2.indexOf(55)) // первое вхождение, если есть дубли "55"
    println(list2.lastIndexOf(55)) // последний индекс встречающегося элемента, если есть дубли

    // Сортировка
    list2.sort() // сортировка по возрастанию
    list2.sortDescending() // сортировка по убыванию
    list2.reverse() // изменения порядка на обратный

    // Инлайновая функция forEach

    list2.forEach { it: Int ->
        println(it)
    }
    // произвольное имя переменной внутри тела лямбды
    list2.forEach { number: Int ->
        println(number)
    }

    // ** Лучше использовать
    // интервал - for
    // коллекция - forEach
    // break, continue - for

    // Фильтрация элементов
    val list3 = list2.filter {
        it == 55
    }
    list3.forEach { println(it) }


}