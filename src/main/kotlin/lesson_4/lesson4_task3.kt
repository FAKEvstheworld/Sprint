package lesson_4

const val SUNNY = true
const val OPEN = true
const val REQUIRED_HUMIDITY = 20
const val BAD_SEASON = "зима"

fun main() {

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity = 20
    val season = "зима"

    val conditions =
        (isSunny == SUNNY) && (isAwningOpen == OPEN) && (airHumidity == REQUIRED_HUMIDITY) && (season != BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")

}