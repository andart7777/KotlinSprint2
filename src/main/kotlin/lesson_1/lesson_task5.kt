package lesson_1

fun main() {
    val seconds: Int = 6480
    val hours: Int
    val minutes: Int
    val remainingSeconds: Int

    hours = seconds / 3600
    minutes = (seconds % 3600) / 60
    remainingSeconds = seconds % 60

    println("$hours:$minutes:$remainingSeconds")
    println(String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds))
    // 1:48:0
}
