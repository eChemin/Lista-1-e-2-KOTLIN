fun main() {
    println("digite um n�mero:")
    val numero = readLine()?.toIntOrNull() ?: return println("entrada inv�lida.")
    val numeroOriginal = numero
    var soma = 0
    val quantidadeDigitos = numero.toString().length

    var temp = numero
    while (temp > 0) {
        val digito = temp % 10
        soma += Math.pow(digito.toDouble(), quantidadeDigitos.toDouble()).toInt()
        temp /= 10
    }
    if (soma == numeroOriginal) {
        println("$numeroOriginal � um n�mero de Armstrong.")
    } else {
        println("$numeroOriginal n�o � um n�mero de Armstrong.")
    }
}
