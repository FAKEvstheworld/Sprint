package lesson_6

fun main() {

    println("Введите кол-во секунд для запуска таймера:")

    val seconds = readln().toInt()
    var timer = seconds

    while (timer >= 0){
        if (timer == 0) println("Время вышло. Прошло $seconds секунд")
        else println("Осталось $timer секунд")
        timer--
        Thread.sleep(1000)
    }

}