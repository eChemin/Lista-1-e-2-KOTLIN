fun main() {
    val numeros = intArrayOf(10, 25, 3, 8, 50, 2)
    var maiorNumero = numeros[0] // inicializa com o primeiro n�mero
    for (numero in numeros) {
        if (numero > maiorNumero) {
            maiorNumero = numero
        }
    }
    println("o maior n�mero �: $maiorNumero")
}