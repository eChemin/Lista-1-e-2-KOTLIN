fun main() {
    println("quantos nomes voc� quer inserir?")
    val input = readLine()?.toIntOrNull()
    if (input == null || input <= 0) {
        println("insira um n�mero v�lido.")
        return
    }
    val nomes = Array(input) { "" }
    for (i in nomes.indices) {
        println("digite o nome ${i + 1}:")
        nomes[i] = readLine() ?: ""
    }
    nomes.sort()
    println("os nomes em ordem alfab�tica s�o:")
    for (nome in nomes) {
        println(nome)
    }
}