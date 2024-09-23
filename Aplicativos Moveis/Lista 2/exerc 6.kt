fun main() {
    val numeros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var somaPares = 0

    for (numero in numeros) {
        if (numero % 2 == 0) {
            somaPares += numero
        }
    }
    println("a soma dos números pares é: $somaPares")
}