package lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var isHuman = false
    var attemptsCount = 3

    println("Добро пожаловать!")

    while (isHuman == false) {

        val a = Random.nextInt(1..9)
        val b = Random.nextInt(1..9)

        println("Введите результат выражения $a + $b: ")

        val input = readln().toInt()

        if (input == a + b) {
            println("Добро пожаловать!")
            isHuman = true
        }
        else {
            attemptsCount--
            if (attemptsCount == 0) {
                println("Доступ запрещен")
                break
            }
            println("Неверно. Осталось попыток: $attemptsCount")

        }
    }
}