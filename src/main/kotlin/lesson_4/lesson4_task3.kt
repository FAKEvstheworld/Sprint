package lesson_4

fun main() {

    val weatherSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val airHumidity = 20
    val season = "зима"

    val conditions = (weatherSunny == true) && (tentIsOpen == true) && (airHumidity == 20) && (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")

}