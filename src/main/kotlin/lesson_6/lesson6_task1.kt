package lesson_6

fun main() {

    val login = "FAKE"
    val password = "12345"
    var isAuth = false

    while (isAuth == false){

        println("Введите логин: ")

        val inputLogin = readln()

        println("Введите пароль: ")

        val inputPass = readln()

        if ((inputLogin == login) && (inputPass == password)){
            isAuth = true
            println("Авторизация прошла успешно")
        }
        else println("Попробуйте еще раз")

    }

}