package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("хлеб", "колбаса", "майонез")

    for (i in arrayOfIngredients) {
        println("${arrayOfIngredients.indexOf(i) + 1}. $i")
    }

    println("Введите ингредиент, который хотите изменить: ")

    val inputIngredient = readln()

    if (!arrayOfIngredients.contains(inputIngredient)) {
        println("Такого ингредиента нет")

    } else {
        println("Введите название нового ингредиента")

        val newIngredient = readln()

        arrayOfIngredients[arrayOfIngredients.indexOf(inputIngredient)] = newIngredient

        println("Готово! Вы сохранили следующий список:")

        for (i in arrayOfIngredients) {
            println("${arrayOfIngredients.indexOf(i) + 1}. $i")
        }
    }
}