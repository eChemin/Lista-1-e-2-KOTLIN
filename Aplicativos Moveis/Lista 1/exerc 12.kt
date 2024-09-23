fun main() {
    print("Digite a nota : ")
    val nota = readLine()?.toDoubleOrNull()
    if (nota == null || nota !in 0.0..10.0) {
        println("Nota inválida. Insira um valor entre 0 e 10.")
        return
    }
    val conceito = when {
        nota >= 9.0 -> "A"
        nota >= 7.0 -> "B"
        nota >= 5.0 -> "C"
        nota >= 3.0 -> "D"
        else -> "F"
    }
    println("O conceito correspondente à nota $nota é: $conceito")
}