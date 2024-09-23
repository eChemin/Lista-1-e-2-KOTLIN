class Calculadora {
    companion object {
        fun soma(a: Double, b: Double): Double = a + b
        fun subtracao(a: Double, b: Double): Double = a - b
        fun multiplicacao(a: Double, b: Double): Double = a * b
        fun divisao(a: Double, b: Double): Double {
            require(b != 0.0) { "divis�o por zero n�o � permitida." }
            return a / b
        }
    }
}
fun main() {
    val a = 10.0
    val b = 5.0
    println("Soma: ${Calculadora.soma(a, b)}")
    println("Subtra��o: ${Calculadora.subtracao(a, b)}")
    println("Multiplica��o: ${Calculadora.multiplicacao(a, b)}")
    println("Divis�o: ${Calculadora.divisao(a, b)}")
}