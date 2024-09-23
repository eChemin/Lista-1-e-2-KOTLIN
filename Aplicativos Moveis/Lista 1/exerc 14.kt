fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readLine()?.toDoubleOrNull()
    print("Digite o segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull()

    if (numero1 == null || numero2 == null) {
        println("Entrada inválida. Por favor, insira números válidos.")
        return
    }
    print("Digite a operação desejada (+, -, *, /): ")
    val operacao = readLine()?.trim()

    val resultado = when (operacao) {
        "+" -> numero1 + numero2
        "-" -> numero1 - numero2
        "*" -> numero1 * numero2
        "/" -> {
            if (numero2 == 0.0) {
                println("Erro: Divisão por zero não é permitida.")
                return
            }
            numero1 / numero2
        }
        else -> {
            println("Operação inválida")
            return
        } }
    println("Resultado: $resultado")
}