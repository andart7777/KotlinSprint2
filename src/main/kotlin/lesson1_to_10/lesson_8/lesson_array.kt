package lesson1_to_10.lesson_8

fun main() {

     // Массив - набор данных одного типа, фиксированная длина
    val arrayOfIngredients: Array<String> = arrayOf("яйцо", "помидор", "колбаса", "соль", "перец")

    val intArray1 = intArrayOf(1, 2, 3, 4, 5)
    val charArray1 = charArrayOf('1', '2', '3')

    // Явное проставление типов обязательно в пустом arrayOf()
    val emptyArray2: Array<String> = arrayOf()
    // В intArrayOf() не обязательно
    val intArray2 = intArrayOf()

    // Пересоздание массива, старый будет удален (запись в ячейке памяти)
    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
    intArray3 = intArrayOf(1, 2, 3, 4, 5)

    println("Размер массива ${intArray3.size}")

    // Индекс элемента
    println("Индекс элемента помидор: ${arrayOfIngredients.indexOf("помидор")}")

    // Изменение элементов
    arrayOfIngredients[4] = "паприка"
    println(arrayOfIngredients[4])

    // Альтернативные способы чтения и записи в массив по индексу (set, get)

    arrayOfIngredients.set(1, "капуста")
    arrayOfIngredients.get(1)

    for (i in arrayOfIngredients) {
        println("ингредиент - ${arrayOfIngredients.indexOf(i) + 1} ${i}")
    }


}