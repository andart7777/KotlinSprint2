package lesson1_to_10.lesson_7

import java.io.File
import java.util.Scanner

//### Задача 14 ###
//Создай программу, которая будет выводить все файлы в указанной директории.

fun main() {

    // для считывания различных типов данных (строки, числа и т.д.) из различных источников (консоль, файл, строка и т.д.).

    val scanner = Scanner(System.`in`)
    print("Введите путь к директории:  ")

    // Считываем данные с консоли
    val directoryPath = scanner.nextLine()

    // Создаем объект File, представляющий указанную директорию
    val directory = File(directoryPath)

    // Проверяем, существует ли директория и является ли она директорией
    if (directory.exists() && directory.isDirectory) {
        // Получаем список всех файлов в директории
        val files = directory.listFiles()
        // Проверяем, не является ли список файлов null
        if (files != null) {
            // Перебираем все файлы в списке
            for (file in files) {
                // Проверяем, является ли текущий файл обычным файлом (а не директорией)
                if (file.isFile) {
                    println(file.name)
                }
            }
        } else {
            println("Директория пуста")
        }
    } else {
        println("Указанная директория не существует или не является директорией")
        val currentDirectory = System.getProperty("user.dir")
        println("Текущая рабочая директория: $currentDirectory")
    }

}