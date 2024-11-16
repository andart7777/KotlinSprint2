package lesson1_to_10.lesson_1

fun main() {
    val seconds: Int = 6480
    val hours: Int
    val minutes: Int
    val remainingSeconds: Int

    val secondsInOneHour: Int = 3600
    val secondsInOneMinute: Int = 60

    hours = seconds / secondsInOneHour
    minutes = (seconds % secondsInOneHour) / secondsInOneMinute
    remainingSeconds = seconds % secondsInOneMinute

    println("$hours:$minutes:$remainingSeconds")
    println(String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds))
    // 1:48:0
}