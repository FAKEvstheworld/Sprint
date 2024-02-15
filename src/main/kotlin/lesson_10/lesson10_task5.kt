package lesson_10

//Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.
//
//Метод авторизации принимает логин и пароль, верифицирует пользователя, генерирует и возвращает токен доступа.
//При неудачной авторизации возвращается null.
//Токен - текстовая строка, генерируемая методом авторизации (32 символа, которые включают цифры и буквы англ. алфавита).
//Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token
//
//Метод получения корзины принимает токен и возвращает список товаров (содержимое переменной корзины).
//
//Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации.
//Переменные логин, пароль и корзина проинициализированы заранее и неизменяемы.

fun main() {

    val login = "FAKE"
    val password = "12345"
    val token = authorization(login, password)

    println("Вернувшийся токен: $token")

    getBasket(token)

}

fun authorization(login: String, password: String): String? {

    val numRange = '0'..'9'
    val letterRange = ('a'..'z')
    var token = ""

    println("Введите логин: ")

    val inputLogin = readln()

    println("Введите пароль: ")

    val inputPassword = readln()

    if ((inputLogin == login) && (inputPassword == password)) {
        for (i in 1..32) {
            when ((0..1).random()) {
                0 -> token += numRange.random()
                1 -> token += letterRange.random()
            }
        }

        println("[authorization получила корректные логин с паролем и вернула токен]")

        return token

    } else {

        println("[authorization получила НЕкорректные логин с паролем и вернула null]")

        return null

    }
}

fun getBasket(token: String?): String? {
    if (token != null) {

        println("[getBasket получила токен $token и вернула список товаров из корзины:]")

        val basket = listOf("Samsung Galaxy S21", "Intel core i5 12400", "Салфетка для экрана монитора")

        println(basket.joinToString(", "))

        return basket.joinToString(", ")

    } else {

        println("[getBasket получила токен null и НЕ вернула список товаров из корзины с этой ошибкой:]")
        println("Логин или пароль некорректные")

        return null
    }
}



