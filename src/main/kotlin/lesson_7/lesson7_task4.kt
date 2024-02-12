package lesson_7

fun main() {

    println("Введите кол-во секунд для таймера: ")

    val seconds = readln().toInt()
    val timer = seconds downTo 0

    for (i in timer) {
        if (i == 0) println("Время вышло")
        else println(i)
        Thread.sleep(1000)
    }
}