fun main() {
    println("digite seu nome:")
    val nome = readLine() ?: ""
    println("qual letra voc� quer contar?")
    val letra = readLine()?.get(0)
    if (letra == null) {
        println("insira uma letra v�lida.")
        return
    }
    var contador = 0
    for (char in nome) {
        if (char.equals(letra, ignoreCase = true)) {
            contador++
        }
    }
    println("a letra '$letra' aparece $contador vezes no seu nome.")
}