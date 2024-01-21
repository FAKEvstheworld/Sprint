package lesson_2

import kotlin.math.pow

fun main() {

    val enteredAmount = 70000
    val interestRate = 16.7
    val yearsCount = 20

    val finalDepositAmount = enteredAmount*((1+(interestRate/100)).pow(yearsCount))
    println(String.format("%.3f", finalDepositAmount)) // 1536438,428

}