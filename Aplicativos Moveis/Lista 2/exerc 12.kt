fun main() {
    println("digite uma palavra:")
    val palavra = readLine() ?: ""
    val reversa = StringBuilder()
    for (i in palavra.length - 1 downTo 0) {
        reversa.append(palavra[i])
    }
    if (palavra.equals(reversa.toString(), ignoreCase = true)) {
        println(" '$palavra' � um pal�ndromo.")
    } else {
        println(" '$palavra' n�o � um pal�ndromo.")
    }
}