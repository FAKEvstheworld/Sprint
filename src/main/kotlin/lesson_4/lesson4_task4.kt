package lesson_4

fun main() {

    val day = 6

    val isEven = (day%2 != 0) // 1, 3, 5 - true

    println("""
Упражнения для рук: ${isEven}
Упражнения для ног: ${!isEven}
Упражнения для спины: ${!isEven}
Упражнения для пресса: ${isEven}""")

}