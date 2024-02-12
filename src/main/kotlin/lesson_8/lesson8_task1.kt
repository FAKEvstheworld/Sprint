package lesson_8

fun main() {

    var advertisementsViewed = intArrayOf(0, 0, 0, 0, 0, 0, 0)
    var weekViews = 0

    for (i in 0 until advertisementsViewed.size) {
        advertisementsViewed[i] = (0..10).random() // симуляция записи данных о просмотре рекламы
    }

    for (i in advertisementsViewed) {
        println(i) // смотрим сколько просмотров стало после записи, по дням
    }

    for (i in advertisementsViewed) {
        weekViews += i // считаем сумму просмотров за неделю
    }

    println(weekViews)

}