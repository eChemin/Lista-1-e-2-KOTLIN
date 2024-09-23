fun main() {
    print("Digite um número para ver sua tabuada: ")
    val numero = readLine()?.toIntOrNull() ?: return
    println("Tabuada do $numero:")
    for (i in 1..10) {
        val resultado = numero * i
        println("$numero x $i = $resultado")
    }
}