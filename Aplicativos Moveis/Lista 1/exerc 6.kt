fun main() {
    print("Digite um n�mero para calcular seu fatorial: ")
    val numero = readLine()?.toIntOrNull() ?: return

    var fatorial = 1

    for (i in 1..numero) {
        fatorial *= i
    }

    println("O fatorial de $numero �: $fatorial")
}