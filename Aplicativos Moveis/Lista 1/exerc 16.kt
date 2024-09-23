fun main() {
    println("Digite os números separados por espaço:")
    val input = readLine() ?: ""
    val numeros = input.split(" ").mapNotNull { it.toIntOrNull() }

    if (numeros.isEmpty()) {
        println("digite um numero valido")
        return
    }
    var maior = numeros[0]
    var menor = numeros[0]

    for (numero in numeros) {
        if (numero > maior) maior = numero
        if (numero < menor) menor = numero
    }
    println("O maior é: $maior")
    println("O menor é: $menor")
}