package lesson_5

import kotlin.random.Random

fun main() {

    val min = 0
    val max = 42

    val listNumbers = (min..max).toList()
    var list = listOf<Int>((listNumbers).random(), (listNumbers).random(), (listNumbers).random())

    println("[Для разработчика] Выигрышные числа: $list")

    println("Введите числа от $min до $max")
    println("Введите первое число: ")
    val inputNum1 = readln().toInt()
    println("Введите второе число: ")
    val inputNum2 = readln().toInt()
    println("Введите третье число: ")
    val inputNum3 = readln().toInt()

    var inputList = listOf(inputNum1, inputNum2, inputNum3)

    if ((inputNum1 >= min) and (inputNum1 <= max) and (inputNum2 >= min) and (inputNum2 <= max)
        and (inputNum3 >= min) and (inputNum3 <= max)) {
        val commonNums = list.intersect(inputList)
        if (commonNums.size == 3) println("Вы угадали все числа и выиграли джекпот!")
        else if (commonNums.size == 2) println("Вы угадали два числа и получаете крупный приз!")
        else if (commonNums.size == 1) println("Вы угадали одно число, вам выплачивается утешительный приз.")
        else if (commonNums.size == 0) println("Вы не угадали ни одного числа")
        println("Выигрышные числа были: $list")
    }
    else println("Числа нет подходят")
}