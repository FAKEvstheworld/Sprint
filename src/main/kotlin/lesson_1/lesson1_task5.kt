package lesson_1

const val MINUTES_IN_A_HOUR = 60
const val SECONDS_IN_A_MINUTE = 60
const val SECONDS_IN_A_HOUR = 3600

fun main(){

    var allSeconds: Int = 6485
    var hours = allSeconds/SECONDS_IN_A_HOUR // кол-во целых часов (1)
    var minutes = allSeconds/MINUTES_IN_A_HOUR%MINUTES_IN_A_HOUR // кол-во целых минут после часа (48)
    var seconds = allSeconds%SECONDS_IN_A_MINUTE // кол-во целых секунд после минут (5)

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}