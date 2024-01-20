package lesson_1

fun main(){
    var allSeconds: Int = 6485
    var hours = allSeconds/60/60
    var minutes = allSeconds/60%60
    var seconds = allSeconds%60

    val h = length(hours)
    val m = length(minutes)
    val s = length(seconds)

    println("Времени в космосе проведено: $h:$m:$s")

}
fun length(number: Int): String {
    var n = number.toString()
    if (number<10) n = "0$number"
    else n = number.toString()
    return n
}