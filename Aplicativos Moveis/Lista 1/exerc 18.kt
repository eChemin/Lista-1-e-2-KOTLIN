fun main() {
    println("digite um número:")
    val numero = readLine()?.toIntOrNull() ?: return println("entrada inválida.")
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
        println("$numeroOriginal é um número de Armstrong.")
    } else {
        println("$numeroOriginal não é um número de Armstrong.")
    }
}
