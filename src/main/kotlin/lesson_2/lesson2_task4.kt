package lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
//    println("Без баффа добыто $crystalOre кристаллической и $ironOre железной руды")

    val buffSize = 1.2
    val crystalOreByBuff = crystalOre*buffSize-crystalOre
    val ironOreByBuff = ironOre*buffSize-ironOre
    println("""Добыто бонусной руды с баффом: 
        |${crystalOreByBuff.toInt()} кристаллической
        |${ironOreByBuff.toInt()} железной""".trimMargin())

// Объявил 20% как 1.2, так можно или нужно объявлять как 20:
//    val crystalOre = 7
//    val buffSize = 20
//    val crystalOreByBuff = crystalOre1 * (buffSize1.toFloat() / 100)
//    println(crystalOreByBuff.toInt()) // 1

}