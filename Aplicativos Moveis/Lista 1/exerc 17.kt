fun main() {
    println("Digite um número:")
    val input = readLine() ?: ""
    val numero = input.toIntOrNull()
    if (numero == null) {
        println("insira um número válido.")
        return
    }
    var soma = 0
    var num = Math.abs(numero)
    while (num > 0) {
        soma += num % 10
        num /= 10
    }
    println("a soma dos dígitos de $numero é: $soma")
}