package lesson_2

//В компании работало 50 человек с зарплатой по 30000 рублей.
// Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
//
// Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.

fun main() {
    val workersCount = 50
    val workersSalary = 30000

    val traineesCount = 30
    val traineesSalary = 20000

    val workersExpenses = workersCount*workersSalary
    val traineesExpenses = traineesCount*traineesSalary

    val generalCount = traineesCount+workersCount
    val generalExpenses = workersExpenses+traineesExpenses

    val averageSalary = generalExpenses/generalCount

    println("""Расходы на выплату зарплаты постоянных сотрудников: $workersExpenses рублей.
        |Общие расходы по ЗП после прихода стажеров: $generalExpenses рублей.
        |Средняя ЗП после устройства стажеров: $averageSalary рублей.
    """.trimMargin())
}