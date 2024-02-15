package lesson_7

fun main() {

    println("Введите число: ")

    val number = readln().toInt()

    val range = 0..number step 2

    for (i in range) println(i)

}