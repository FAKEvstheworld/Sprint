package lesson_5

fun main() {

    val a = 5
    val b = 2

    println("Сложите эти два числа: $a и $b")
    val input = readln().toInt()
    if (input == a+b) println("Добро пожаловать!") else println("Доступ запрещен.")

}