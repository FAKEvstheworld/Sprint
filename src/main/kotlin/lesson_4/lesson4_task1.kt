package lesson_4

const val tableCount = 13

fun main() {

    var reservedTableToday = 13
    var reservedTableTom = 9

    val availableToday = tableCount != reservedTableToday
    val availableTom = tableCount != reservedTableTom

    println("Доступность столиков на сегодня: $availableToday\nДоступность столиков на завтра: $availableTom")
//
}