package lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var moveNum = 1
    var moveData = "[$from-$to;$moveNum]"

    println(moveData)

    from = "D2"

    var forward = 1 // продвижение на одну клетку вперёд
    var destinationNum = from.drop(1).toInt() + forward
    to = from.dropLast(1) + destinationNum
    moveNum += 1
    moveData = "[$from-$to;$moveNum]"

    println(moveData)

}