package lesson_7

fun main() {

    val rangeTo100 = 0..100 step 2

    println("Введите число: ")

    val number = readln().toInt()

    for (i in rangeTo100) {
        println(i)
        if (i == number) break
    }

}