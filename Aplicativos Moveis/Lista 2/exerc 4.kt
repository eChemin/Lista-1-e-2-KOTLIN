fun main() {
    val numeros = intArrayOf(10, 20, 30, 40, 50)
    println("digite o número que você deseja procurar:")
    val input = readLine()?.toIntOrNull()
    if (input == null) {
        println("insira um número válido.")
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
        println("o número $input foi encontrado no array.")
    } else {
        println("o número $input não está presente no array.")
    }
}