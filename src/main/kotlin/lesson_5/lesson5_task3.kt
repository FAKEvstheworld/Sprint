package lesson_5

fun main() {

    val winNum1 = 18
    val winNum2 = 36
    val min = 0
    val max = 42

    println("Введите числа от $min до $max")
    println("Введите первое число: ")
    val inputNum1 = readln().toInt()
    println("Введите второе число: ")
    val inputNum2 = readln().toInt()

    if (inputNum1 >= 0 && inputNum1 <= 42 && inputNum2 >= 0 && inputNum2 <= 42) {
        if ((inputNum1 == winNum1 || inputNum1 == winNum2) && (inputNum2 == winNum1 || inputNum2 == winNum2) &&
            inputNum1 != inputNum2
        ) println("Поздравляем! Вы выиграли главный приз!")
        else if ((inputNum1 == winNum1 || inputNum1 == winNum2) || (inputNum2 == winNum1 || inputNum2 == winNum2))
            println("Вы выиграли утешительный приз! Выигрышные числа были $winNum1 и $winNum2")
        else println("Неудача! Выигрышные числа были $winNum1 и $winNum2")
    }
    else println("Числа нет подходят")

}