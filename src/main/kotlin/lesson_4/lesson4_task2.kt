package lesson_4

    const val minWeight = 35
    const val maxWeight = 100
    const val maxVolume = 100

fun main() {

    var cargoWeight = 20
    var cargoVolume = 80

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${((minWeight < cargoWeight) and (cargoWeight <= maxWeight)) and (cargoVolume < maxVolume)}")

    cargoWeight = 50
    cargoVolume = 100

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': " +
            "${((minWeight < cargoWeight) and (cargoWeight <= maxWeight)) and (cargoVolume < maxVolume)}")

}