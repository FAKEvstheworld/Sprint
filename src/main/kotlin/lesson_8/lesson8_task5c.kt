package lesson_8

fun main() {

    println("Введите количество ингредиентов: ")

    val ingredientsCount = readln().toInt()

    val arrayOfIngredients = Array(ingredientsCount) { "0" }

    for (i in 0 until ingredientsCount) {
        println("Введите название игредиента №${i + 1}: ")
        val inputIngredient = readln()
        arrayOfIngredients[i] = inputIngredient
    }

    println("Готово! Вы сохранили следующий список:")

    for (i in arrayOfIngredients) {
        println("${arrayOfIngredients.indexOf(i) + 1}. $i")
    }
}