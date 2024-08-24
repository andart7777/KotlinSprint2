package lesson_2

fun main() {
    val firstStudent = 3
    val secondStudent = 4
    val thirdStudent = 3
    val fourthStudent = 5

    val numberOfStudents = 4

    var averageRating: Float

    averageRating = ((firstStudent + secondStudent + thirdStudent + fourthStudent).toFloat()) / numberOfStudents

    println(averageRating)
}
