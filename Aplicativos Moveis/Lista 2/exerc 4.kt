fun main() {
    val numeros = intArrayOf(10, 20, 30, 40, 50)
    println("digite o n�mero que voc� deseja procurar:")
    val input = readLine()?.toIntOrNull()
    if (input == null) {
        println("insira um n�mero v�lido.")
        return
    }
    var encontrado = false
    for (numero in numeros) {
        if (numero == input) {
            encontrado = true
            break
        }
    }
    if (encontrado) {
        println("o n�mero $input foi encontrado no array.")
    } else {
        println("o n�mero $input n�o est� presente no array.")
    }
}