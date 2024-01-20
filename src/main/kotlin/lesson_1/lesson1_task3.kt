package lesson_1

fun main(){
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7
    // есть какой-то способ задавать перменным значения 09 и 07, без использования String?

    println("""$year
        |$hour
        |$minute
    """.trimMargin())

    hour = 10
    minute = 55

    println("Время посадки: $hour:$minute")
}