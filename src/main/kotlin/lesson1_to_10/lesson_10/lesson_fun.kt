package lesson1_to_10.lesson_10

fun main() {

    printNameAndAge(userName = getName(), userAge = getAge())
}

fun getName(): String? {
    return readLine().toString()
}

fun getAge(): String? {
    return readLine().toString()
}

fun printNameAndAge(userName: String?, userAge: String?) {
    println("User data: $userName, $userAge")
}
