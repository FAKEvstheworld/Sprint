package lesson_3

fun main() {

    val eveningGreeting = "Добрый вечер, "
    val dayGreeting = "Добрый день, "
    val username = "Игорь"

    val time = 19

    val greeting = if (time > 18) eveningGreeting + username else dayGreeting + username

    println(greeting)

}