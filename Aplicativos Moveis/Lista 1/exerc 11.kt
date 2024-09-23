un main() {
    print("Digite um numero para ver se é perfeito: ")
    val numero = readLine()?.toIntOrNull()
    if (numero == null || numero <= 0) {
        println("numero inválido. Por favor, insira um número positivo.")
        return
    }
    var somaDivisores = 0
    for (i in 1 until numero) {
        if (numero % i == 0) {
            somaDivisores += i
        }}
    if (somaDivisores == numero) {
        println("$numero é perfeito!")
    } else {
        println("$numero não é perfeito.")
    }
}