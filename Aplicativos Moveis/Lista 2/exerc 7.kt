fun main() {
    val nomes = arrayOf("enzo", "bruno", "carlos", "daniela", "eduardo")
    val arrayInvertido = Array(nomes.size) { "" }
    for (i in nomes.indices) {
        arrayInvertido[i] = nomes[nomes.size - 1 - i]
    }
println("o array invertido é:")
    for (nome in arrayInvertido) {
        println(nome)
    }
}