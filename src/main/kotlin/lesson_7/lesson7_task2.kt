package lesson_7

fun main() {

    val codeRange = 1000..9999
    val code = codeRange.random()

    do {

        println("[СМС] Ваш код авторизации: $code")
        println("[АВТОРИЗАЦИЯ] Введите код из СМС: ")

        val inputCode = readln().toInt()

        if (inputCode == code) {
            println("[АВТОРИЗАЦИЯ] Код верный, вы успешно вошли.")
        } else println("[АВТОРИЗАЦИЯ] Код неверный, попробуйте еще раз \n")

    } while (inputCode != code)

}