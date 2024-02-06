package lesson_4

const val TABLE_COUNT = 13

fun main() {

    val reservedTableToday = 13
    val reservedTableTom = 9

    val availableToday = TABLE_COUNT != reservedTableToday
    val availableTom = TABLE_COUNT != reservedTableTom

    println("Доступность столиков на сегодня: $availableToday\nДоступность столиков на завтра: $availableTom")
//
}