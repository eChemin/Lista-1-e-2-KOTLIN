fun main() {
    println("digite um n�mero:")
    val input = readLine() ?: ""
    val numero = input.toIntOrNull()
    if (numero == null || numero <= 0) {
        println("insira um n�mero inteiro positivo.")
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
    println("a sequ�ncia de Collatz para $numero �: ${sequencia.joinToString(" -> ")}")
}