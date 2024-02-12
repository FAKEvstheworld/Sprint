package lesson_7

fun main() {

    val codeRange = 1000..9999
    var isAuth = false

    while (isAuth == false) {

        val code = codeRange.random()

        println("[СМС] Ваш код авторизации: $code")
        println("[АВТОРИЗАЦИЯ] Введите код из СМС: ")

        val inputCode = readln().toInt()

        if (inputCode == code) {
            println("[АВТОРИЗАЦИЯ] Код верный, вы успешно вошли.")
            isAuth = true
        } else println("[АВТОРИЗАЦИЯ] Код неверный, выслан новый код \n")

    }

}