import kotlin.math.roundToInt

fun main() {
    val comissionPercent = 0.75
    val minComission = 35.0
    val amount = 12590.0

    var comission = (amount / 100 * comissionPercent * 100).roundToInt() / 100.0

    if (comission < minComission) comission = minComission

    println(comission)
}