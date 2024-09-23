class Temperatura {
    companion object {
        fun celsiusParaFahrenheit(celsius: Double): Double {
            return (celsius * 9/5) + 32
        }
        fun fahrenheitParaCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5/9
        }
    }
}

fun main() {
    val celsius = 25.0
    val fahrenheit = 77.0
    val fahrenheitConvertido = Temperatura.celsiusParaFahrenheit(celsius)
    val celsiusConvertido = Temperatura.fahrenheitParaCelsius(fahrenheit)

    println("$celsius °C é igual a $fahrenheitConvertido °F")
    println("$fahrenheit °F é igual a $celsiusConvertido °C")
}