fun main() {
    println("digite um n�mero n:")
    val input = readLine() ?: ""
    val n = input.toIntOrNull()
    if (n == null || n <= 0) {
        println(" insira um n�mero inteiro positivo.")
        return
    }
    var soma = 0
    for (i in 1..n) {
        soma += i * i
    }
    println("a soma dos quadrados de 1 a $n �: $soma")
}