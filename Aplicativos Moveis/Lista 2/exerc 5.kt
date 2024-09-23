fun main() {
    println("quantos nomes você quer inserir?")
    val input = readLine()?.toIntOrNull()
    if (input == null || input <= 0) {
        println("insira um número válido.")
        return
    }
    val nomes = Array(input) { "" }
    for (i in nomes.indices) {
        println("digite o nome ${i + 1}:")
        nomes[i] = readLine() ?: ""
    }
    nomes.sort()
    println("os nomes em ordem alfabética são:")
    for (nome in nomes) {
        println(nome)
    }
}