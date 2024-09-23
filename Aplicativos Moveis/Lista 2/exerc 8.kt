fun main() {
    println("digite uma frase:")
    val frase = readLine() ?: ""
    val palavras = frase.split(" ")
    val contador = mutableMapOf<String, Int>()
    for (palavra in palavras) {
        contador[palavra] = contador.getOrDefault(palavra, 0) + 1
    }
    val palavrasUnicas = contador.filter { it.value == 1 }.keys
    println("as palavras únicas são:")
    for (palavra in palavrasUnicas) {
        println(palavra)
    }
}