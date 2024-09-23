fun main() {
    val numeros = intArrayOf(2, 4, 6, 8, 10)
    println("digite o fator de multiplicação:")
    val fatorInput = readLine()?.toIntOrNull()
    if (fatorInput == null) {
        println("insira um número válido.")
        return
    }
    val novoArray = IntArray(numeros.size)
    for (i in numeros.indices) {
        novoArray[i] = numeros[i] * fatorInput
    }
    println("o novo array com os valores multiplicados é:")
    println(novoArray.joinToString(", "))
}