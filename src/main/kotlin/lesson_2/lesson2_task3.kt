package lesson_2

const val MINUTES_IN_A_HOUR = 60

fun main() {

    val hourOfDeparture: Byte = 9
    val minuteOfDeparture: Byte = 39
    val travelTime: Short = 457

    val departureTime =
        hourOfDeparture * MINUTES_IN_A_HOUR + minuteOfDeparture // время отправления конвертированное в минуты (579)
    val arrivalTime = departureTime + travelTime // время прибытия в минутах (1036)

    val arrivalHour = arrivalTime / MINUTES_IN_A_HOUR // час прибытия (17)
    val arrivalMinute = arrivalTime % MINUTES_IN_A_HOUR // минута прибытия (16)

    println("Время прибытия: $arrivalHour:$arrivalMinute")

}