import java.lang.NumberFormatException

fun main() {

    try {
        print("Number 1: ")
        val string1: String? = readLine()
        val number1: Double = string1!!.toDouble()

        print("Number2: ")
        val string2: String? = readLine()
        val number2: Double = string2!!.toDouble()

        print("Select an operation (+ - / *): ")
        val operation: String? = readLine()

        val result: Double? =
            when (operation) {
                "+" -> addValues(number1, number2)
                "-" -> subtractValues(number1, number2)
                "*" -> multiplyValues(number1, number2)
                "/" -> divideValues(number1, number2)
                else -> throw Exception("Unknown operation")
            }
        println("The answer is $result")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }

}

fun addValues(number1: Double, number2: Double) = number1 + number2
fun subtractValues(number1: Double, number2: Double) = number1 - number2
fun multiplyValues(number1: Double, number2: Double) = number1 * number2
fun divideValues(number1: Double, number2: Double) = number1 / number2

