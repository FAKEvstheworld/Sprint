package lesson_4

const val PEOPLE_COUNT_MIN = 55
const val PEOPLE_COUNT_MAX = 70
const val BOX_NEEDS = 50

fun main() {

    println("Повреждён ли корабль? true/false")

    val isDamaged = readln().toBoolean()

    println("Количество экипажа: ")

    val peopleCount = readln().toInt()

    println("Количество ящиков с провизией: ")

    val boxCount = readln().toInt()

    println("Благоприятная ли погода? true/false")

    val isWeatherFine = readln().toBoolean()

    val voyage =
        (isDamaged == false) && (peopleCount > PEOPLE_COUNT_MIN) && (peopleCount < PEOPLE_COUNT_MAX) && (boxCount > BOX_NEEDS) ||
                (isDamaged == true) && (peopleCount == PEOPLE_COUNT_MAX) && (boxCount > BOX_NEEDS) && (isWeatherFine == true)

    println("Корабль может плыть: $voyage")

}