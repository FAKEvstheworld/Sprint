package lesson_4

const val peopleCountMin = 55
const val peopleCountMax = 70
const val boxNeeds = 50

fun main() {

    println("Повреждён ли корабль? true/false")
    val shipDamage = readln().toBoolean()
    println("Количество экипажа: ")
    val peopleCount = readln().toInt()
    println("Количество ящиков с провизией: ")
    val boxCount = readln().toInt()
    println("Благоприятная ли погода? true/false")
    val weatherFine = readln().toBoolean()

    val voyage =
        (shipDamage == false) && (peopleCount > peopleCountMin) && (peopleCount < peopleCountMax) && (boxCount > boxNeeds) ||
                (shipDamage == true) && (peopleCount == peopleCountMax) && (boxCount > boxNeeds) && (weatherFine == true)

    println("Корабль может плыть: $voyage")

}