package lesson_5

fun main() {

    val login = "Zaphod"
    val password = "PanGalactic"

    println("Введите логин: ")
    val inputLogin = readln()
    if (inputLogin == login) {
        println("Введите пароль: ")
        val inputPassword = readln()
        if (inputPassword == password) println("Ваши данные проверены, и о, чудо, они верны... ")
        else println("Пароль неверный")
    }
    else println("Такого пользователя не существует. Хотите зарегистрироваться?")

}