// Урок https://youtu.be/7O3ivzemi1s?si=zJ64-YZWfE-ZwlHb

// Перенес урок NECO по массивам в KotlinSprint

fun main() {


    /* МАССИВЫ - ArrayOf
    * Нельзя расширять список, можно менять элементы или перезаписать полностью
    * Не желательно использовать разные типы данных в массиве */


    /* Способы объявления масcива */

    val numbers1: Array<Int> = arrayOf(1, 2, 3, 4)
    val numbers2: IntArray = intArrayOf(1, 2, 3, 4)
    val numbers3 = IntArray(7) // Пустой массив, длина 7
    val numbers4 = arrayOfNulls<Int>(5) // Пустой массив, длина 7
    val strings = emptyArray<String>() // Без указания количества элементов


    /* Полезные методы масcива */

    // !!   ${numbers.contentToString()} -- Выводить список в консоль

    val arrayFruit= arrayOf("Яблоко", "Апельсин", "Груша")
    val numbers = arrayOf(0, 4, 1, 2, 3, 10, 5, 6, 78, 8)

    numbers.size // Длина массива

    arrayFruit.reverse() // Перевернуть массив
    val arrayFruitReversed = arrayFruit.reversedArray() // Перевернуть массив, сохранить старый

    numbers.sort() // Отсортировать массив
    numbers.sort(0, 3) // Сортировка массива в диапазоне
    numbers.sortDescending() // Сортировка в обратном порядке
    val numbersSort = numbers.sortedArray() // Отсортировать массив и сохранить старый
    val numbersSortDescending = numbers.sortedArrayDescending() // Отсортировать массив и сохранить старый

    val numberContainElement = numbers.contains(78) // Проверка содержится элемент 78 в массиве или нет
    val maxNumber = numbers.maxOrNull() // Проверка на наибольшее значение в массиве
    val minNumber = numbers.minOrNull() // Проверка на наименьшее значение в массиве
    val sumNumber = numbers.sum() // Сумма массива
    val averageNumber = numbers.average() // Сумма массива

    val numbers333 = arrayOf(0, 4, 1, 2, 3, 10, 5, 6, 78, 8)
    val numbers222 = arrayOf(0, 5, 44, 23, 32, 101, 5, 61, 781, 81, 22, 3, 3)

    val numbersSet = numbers333.intersect(numbers222.toList()).toIntArray() // Сравнение двух списков (на выходе Set)

    numbers333.shuffle() // Перемещывает массив


    /* СПИСКИ - listOf, arrayListOf
    * listOf - нельзя изменять, только считывание
    * arrayListOf - можно изменять и дополнять
    * */


    /* Способы объявления масcива */

    val myList = listOf(1, 2, 3, 4)
    val myList2: List<Int> = listOf(1, 2, 3, 4)
    val myList3= listOf<Int>(1, 2, 3, 4)

    val myArrayList = arrayListOf(1, 2, 3, 4)
    val myArrayList2: ArrayList<Int> = arrayListOf(1, 2, 3, 4)


    val MyArrayList3 = arrayListOf(1, 2, 3, 4)

    MyArrayList3.add(22) // Добавить вконец
    MyArrayList3.clear() // Очистить
    MyArrayList3.removeAt(3) // Добавить по индексу

    val arrayTemp = intArrayOf(11, 22, 33, 44)
    val listTemp = listOf(111, 222, 333, 444)
    val arrayListTemp = arrayListOf(111, 222, 333, 444)

    // Добавить в конец массив или список
    MyArrayList3.addAll(arrayTemp.toList())
    MyArrayList3.addAll(listTemp)
    MyArrayList3.addAll(arrayListTemp)

    /* Полезные методы списков */

    val arrayOrigin = listOf(4, 17, 85, 8, 45)
    val arrayOrigin2 = listOf(4, 10, 85, 8, 4)

    val sortedList = arrayOrigin.sorted()
    val sumList = arrayOrigin.sum()
    val reversedList = arrayOrigin.reversed()
    val containsList = arrayOrigin.contains(5)
    val minList = arrayOrigin.minOrNull()
    val maxList = arrayOrigin.maxOrNull()
    val averageList = arrayOrigin.average()
    val shuffledList = arrayOrigin.shuffled()
    val sortedDescendingList = arrayOrigin.sortedDescending()
    val intersection = arrayOrigin.intersect(arrayOrigin2.toList())

}

