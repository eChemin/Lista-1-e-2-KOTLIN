fun main() {
    val numeros = intArrayOf(2, 4, 6, 8, 10)
    println("digite o fator de multiplica��o:")
    val fatorInput = readLine()?.toIntOrNull()
    if (fatorInput == null) {
        println("insira um n�mero v�lido.")
        return
    }
    val novoArray = IntArray(numeros.size)
    for (i in numeros.indices) {
        novoArray[i] = numeros[i] * fatorInput
    }
    println("o novo array com os valores multiplicados �:")
    println(novoArray.joinToString(", "))
}