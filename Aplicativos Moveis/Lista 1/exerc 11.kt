un main() {
    print("Digite um numero para ver se � perfeito: ")
    val numero = readLine()?.toIntOrNull()
    if (numero == null || numero <= 0) {
        println("numero inv�lido. Por favor, insira um n�mero positivo.")
        return
    }
    var somaDivisores = 0
    for (i in 1 until numero) {
        if (numero % i == 0) {
            somaDivisores += i
        }}
    if (somaDivisores == numero) {
        println("$numero � perfeito!")
    } else {
        println("$numero n�o � perfeito.")
    }
}