package lesson_6

fun main() {
    var count = 5

//    while (count > 0) {
//        println("Баннер закроется через ${count--} секунд")
//        Thread.sleep(1000)
//    }

    do {
        println("Баннер закроется через ${count--} секунд")
        Thread.sleep(100)
    } while (false)


}