package lesson_3

fun main() {
    var name = "Татьяна"
    var secondName = "Андреева"
    val surName = "Сергеевна"

    val weddingYear = 22
    val newSecondName = "Сидорова"

    var enteredYear = 20
    var secondNameOnRequestedYear = if (enteredYear < weddingYear) secondName else newSecondName
    var fullName = secondNameOnRequestedYear + " " + name + " " + surName

    println("ФИО: $fullName, возраст: $enteredYear") // ФИО: Андреева Татьяна Сергеевна, возраст: 20

    enteredYear = 22
    secondNameOnRequestedYear = if (enteredYear < weddingYear) secondName else newSecondName
    fullName = secondNameOnRequestedYear + " " + name + " " + surName

    println("ФИО: $fullName, возраст: $enteredYear") // ФИО: Сидорова Татьяна Сергеевна, возраст: 22

}