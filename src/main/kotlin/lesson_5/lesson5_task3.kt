package lesson_5

fun main() {

    val winNum1 = 18
    val winNum2 = 36

    println("Введите первое число: ")
    val inputNum1 = readln().toInt()
    println("Введите второе число: ")
    val inputNum2 = readln().toInt()

    if (((inputNum1 == winNum1) or (inputNum1 == winNum2)) and ((inputNum2 == winNum1) or (inputNum2 == winNum2))
        and (inputNum1 != inputNum2)) println("Поздравляем! Вы выиграли главный приз!")
    else if (((inputNum1 == winNum1) or (inputNum1 == winNum2)) or ((inputNum2 == winNum1) or (inputNum2 == winNum2)))
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Выигрышные числа были $winNum1 и $winNum2")

}