fun main() {
    println("Digite um n�mero:")
    val input = readLine() ?: ""
    val numero = input.toIntOrNull()
    if (numero == null) {
        println("insira um n�mero v�lido.")
        return
    }
    var soma = 0
    var num = Math.abs(numero)
    while (num > 0) {
        soma += num % 10
        num /= 10
    }
    println("a soma dos d�gitos de $numero �: $soma")
}