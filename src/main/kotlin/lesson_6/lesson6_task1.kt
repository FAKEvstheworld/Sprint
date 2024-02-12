package lesson_6

fun main() {

    val login = "FAKE"
    val password = "12345"

    do {

        println("Введите логин: ")

        val inputLogin = readln()

        println("Введите пароль: ")

        val inputPass = readln()

        if ((inputLogin == login) && (inputPass == password)){
            println("Авторизация прошла успешно")
        }
        else println("Попробуйте еще раз")

    } while ((inputLogin != login) || (inputPass != password))

}