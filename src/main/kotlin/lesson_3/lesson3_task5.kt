package lesson_3

fun main() {

    val move = "D2-D4;0"

    val parts = move.split("-|;".toRegex())

    val from = parts[0].trim()
    val to = parts[1].trim()
    val moveNum = parts[2].trim()

    println("""Откуда: $from
    |Куда: $to
    |Номер хода: $moveNum""".trimMargin())

}