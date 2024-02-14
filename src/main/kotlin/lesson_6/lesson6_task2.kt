package lesson_6

fun main() {

    println("Введите кол-во секунд для запуска таймера:")

    val seconds = readln().toLong()

    println("Таймер запущен")

    Thread.sleep(1000*seconds)

    println("Прошло $seconds секунд")

}