fun main() {
    println("digite um número:")
    val input = readLine() ?: ""
    val numero = input.toIntOrNull()
    if (numero == null || numero <= 0) {
        println("insira um número inteiro positivo.")
        return
    }
    var n = numero
    val sequencia = mutableListOf(n)
    while (n != 1) {
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = 3 * n + 1
        }
        sequencia.add(n)
    }
    println("a sequência de Collatz para $numero é: ${sequencia.joinToString(" -> ")}")
}