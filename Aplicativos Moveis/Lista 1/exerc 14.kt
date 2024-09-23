fun main() {
    print("Digite o primeiro n�mero: ")
    val numero1 = readLine()?.toDoubleOrNull()
    print("Digite o segundo n�mero: ")
    val numero2 = readLine()?.toDoubleOrNull()

    if (numero1 == null || numero2 == null) {
        println("Entrada inv�lida. Por favor, insira n�meros v�lidos.")
        return
    }
    print("Digite a opera��o desejada (+, -, *, /): ")
    val operacao = readLine()?.trim()

    val resultado = when (operacao) {
        "+" -> numero1 + numero2
        "-" -> numero1 - numero2
        "*" -> numero1 * numero2
        "/" -> {
            if (numero2 == 0.0) {
                println("Erro: Divis�o por zero n�o � permitida.")
                return
            }
            numero1 / numero2
        }
        else -> {
            println("Opera��o inv�lida")
            return
        } }
    println("Resultado: $resultado")
}