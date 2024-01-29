package lesson_4

fun main() {

    val tableCount = 13
    var reservedTableToday = 13
    var reservedTableTom = 9

    val availableToday = tableCount != reservedTableToday
    val availableTom = tableCount != reservedTableTom

    println("Доступность столиков на сегодня: $availableToday\nДоступность столиков на завтра: $availableTom")

}