package lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val buffSize = 20
    val percent = 100

    val crystalOreByBuff = crystalOre * (buffSize.toFloat() / percent)
    val ironOreByBuff = ironOre * (buffSize.toFloat() / percent)
    println("""Добыто бонусной руды с баффом: 
        |${crystalOreByBuff.toInt()} кристаллической
        |${ironOreByBuff.toInt()} железной""".trimMargin())

}