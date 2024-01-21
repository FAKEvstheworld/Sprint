package lesson_2

fun main() {

    val studentsCount = 4
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5

    val averagePoint = (student1 + student2 + student3 + student4)/studentsCount.toFloat()

    println("Средний балл: ${String.format("%.2f", averagePoint)}")

}