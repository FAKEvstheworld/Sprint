package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2024
    println("Введите год своего рождения: ")
    val yearOfBirth = readln().toInt()
    if (currentYear - yearOfBirth >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Подрасти ещё")

}