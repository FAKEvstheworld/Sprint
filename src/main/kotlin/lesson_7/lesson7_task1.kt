package lesson_7

fun main() {

    val zeroToNine = 0..9
    val aToZ = 'a'..'z'
    var password = ""

    for (i in 1..3){
        password = password + zeroToNine.random() + aToZ.random()
    }

    println(password)

}