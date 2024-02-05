package lesson_4

fun main() {

    val day = 5

    val checkParity = (day%2 != 0) // 1, 3, 5 - true

    val handExercises = checkParity
    val absExercises = checkParity
    val legExercises = !checkParity
    val backExercises = !checkParity

    println("""
Упражнения для рук: $handExercises
Упражнения для ног: $legExercises
Упражнения для спины: $backExercises
Упражнения для пресса: $absExercises""")

}