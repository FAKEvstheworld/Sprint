package lesson_9

//Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
//
//- результат должен исключать повторы;
//- список должен выводиться в алфавитном порядке;
//- все элементы списка выведены в одну строку, разделяя слова запятыми;
//- первый элемент должен быть распечатан с заглавной буквы.

fun main() {

    val ingredients = mutableSetOf<String>()

    for (i in 1 .. 5){

        println("Введите ${i}/5 ингредиент: ")

        val input = readln()

        ingredients.add(input)

    }

    println("Список ингредиентов: ${ingredients.sorted().joinToString().replaceFirstChar(Char::uppercaseChar)}")

}