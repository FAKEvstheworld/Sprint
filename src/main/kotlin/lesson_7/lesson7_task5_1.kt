package lesson_7

const val MIN_PASSWORD_LEN = 6
fun main() {

    val numRange = '0'..'9'
    val letterRange = ('a'..'z')
    val capitalLetterRange = ('A'..'Z')
    var password = ""

    println("Введите желаемое количество символов пароле: ")

    var passwordLength = readln().toInt()

    while (passwordLength < MIN_PASSWORD_LEN) {
        println("Пароль слишком короткий")
        passwordLength = readln().toInt()
    }

    password = password + numRange.random() + letterRange.random() + capitalLetterRange.random() // сразу добавляем 3 нужных символа

    for (i in 1..passwordLength-3) {
        val rangeChoice= (0..2).random()
        when (rangeChoice) { // позволяет добавлять символ каждого типа с одинаковым шансом
            0 -> password += numRange.random()
            1 -> password += letterRange.random()
            2 -> password += capitalLetterRange.random()
        }
    }

    val shufflePassword = password.toMutableList()
    shufflePassword.shuffle()
    password = shufflePassword.joinToString("") // другой простой путь для перемешивания символов в строке я не нашёл

    println(password)
}