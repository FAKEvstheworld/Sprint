package lesson_6

fun main() {

    var attemptsCount = 5
    val secretNumber = 4

    println("Угадайте число от 1 до 9 с $attemptsCount попыток.")

    while (attemptsCount > 0){
        println("Введите число: ")
        val inputNumber = readln().toInt()
        if (inputNumber in 1..9){
            if (inputNumber == secretNumber){
                println("Вы угадали число!")
                break
            }
            else {
                attemptsCount--
                println("Неверное число. Попыток осталось: $attemptsCount")
            }
        }
        else println("неверное число")

    }

}