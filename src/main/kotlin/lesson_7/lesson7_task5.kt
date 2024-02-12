package lesson_7

const val MIN_PASSWORD_LENGTH = 6
fun main() {

    val numRange = '0'..'9'
    val letterRange = ('a'..'z')
    val capitalLetterRange = ('A'..'Z')
    val range = numRange + numRange + numRange + letterRange + capitalLetterRange
    var password = ""

    println("Введите желаемое количество символов пароле: ")

    var passwordLength = readln().toInt()

    while (passwordLength < MIN_PASSWORD_LENGTH) {
        println("Пароль слишком короткий")
        passwordLength = readln().toInt()
    }

    for (i in 1..passwordLength) {
        if (password.length < passwordLength - 2) {
            password = password + range.random()
        }
        else if (password.length >= passwordLength - 2) { // в пароль осталось добавить 2 символа
            if (!password.any(numRange::contains)) {
                password = password + numRange.random() // Если в пароле еще нет цифры, добавляем её
            }

            else if (!password.any(letterRange::contains)) {
                password = password + letterRange.random() // Если в пароле еще нет буквы, добавляем её
            }

            else if (!password.any(capitalLetterRange::contains)) {
                password = password + capitalLetterRange.random() // Если в пароле еще нет заглавной буквы, добавляем её
            }

            else {
                password = password + range.random() // если в пароле уже есть и цифра, и буква, и заглавная буква, то добавляем рандомный символ
            }
        }
    }

    println(password)
}