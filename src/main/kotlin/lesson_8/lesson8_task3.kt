package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("хлеб", "колбаса", "майонез")

    println("Введите название ингредиента: ")

    val input = readln()

    if (arrayOfIngredients.contains(input)) {
        println("Ингредиент $input в рецепте есть")
        return
    } else println("Такого ингредиента в рецепте нет")

}