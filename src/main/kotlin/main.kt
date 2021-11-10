import kotlin.math.roundToInt

fun main () {

    agoToText()
}
fun agoToText() {
    var sec =90000
    var minutes = (sec / 60.0).roundToInt()
    var hours = (minutes / 60.0).roundToInt()
    var wordMinutes = minutes.toString()
    var wordHours = hours.toString()
    val printMinutes = when (wordMinutes) {
        "1", "21", "31", "41", "51" -> "минуту"
        "2", "3", "4", "22", "23", "24", "32", "33", "34", "42", "43", "44", "52", "53", "54" -> "минуты"
        else -> "минут"
    }
    val printHours = when (wordHours) {
        "1", "21" -> "час"
        "2", "3", "4", "22", "23", "24" -> "часа"
        else -> "часов"
    }
    when (sec) {
        in 0..60 -> println("Пользователь был только что")
        in 61..3600 -> println("Пользователь был $minutes $printMinutes назад")
        in 3601..86400 -> println("Пользователь был $hours $printHours  назад")
        in 86401..172800 -> println("Пользователь был сегодня")
        in 172801..259200 -> println("Пользователь был вчера")
        else -> println("Пользователь был давно")
    }
}
