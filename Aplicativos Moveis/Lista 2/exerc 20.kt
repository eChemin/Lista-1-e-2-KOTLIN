class Calculadora {
    companion object {
        fun soma(a: Double, b: Double): Double = a + b
        fun subtracao(a: Double, b: Double): Double = a - b
        fun multiplicacao(a: Double, b: Double): Double = a * b
        fun divisao(a: Double, b: Double): Double {
            require(b != 0.0) { "divisão por zero não é permitida." }
            return a / b
        }
    }
}
fun main() {
    val a = 10.0
    val b = 5.0
    println("Soma: ${Calculadora.soma(a, b)}")
    println("Subtração: ${Calculadora.subtracao(a, b)}")
    println("Multiplicação: ${Calculadora.multiplicacao(a, b)}")
    println("Divisão: ${Calculadora.divisao(a, b)}")
}