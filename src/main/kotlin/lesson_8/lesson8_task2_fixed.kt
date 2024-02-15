package lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("хлеб", "колбаса", "майонез")

    println("Введите название ингредиента: ")

    val input = readln()

    for (i in arrayOfIngredients) {
        println(i)
        if (i == input) {
            println("Ингредиент $input в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")

}