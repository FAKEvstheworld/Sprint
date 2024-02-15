package lesson_10

//Напиши программу, которая генерирует пароли.
//Пароль должен состоять из последовательно чередующихся цифр и специальных символов. Например, 4#4%2!.
//
//- пользователь сам задает длину пароля;
//- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля и возвращающая готовый пароль;
//- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).

fun main() {

    println("Сколько символов должно быть в пароле?")

    val passwordLength = readln().toInt()

    val password = passGen(passwordLength)

    println(password)

}

fun passGen(length: Int): String {

    val numberList = listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    val symbolList = listOf("!", "\"", "#", "$", "%", "&", "\'", "(", ")", "*", "+", ",", "-", ".", "/", " ")
    var password = ""

    for (i in 1..length) {
        when (i % 2) {
            0 -> password += symbolList.random()
            1 -> password += numberList.random()
        }
    }
    return password
}