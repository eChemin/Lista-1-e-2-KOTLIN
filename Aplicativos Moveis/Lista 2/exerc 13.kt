fun main() {
    val numeros = intArrayOf(-6, 8, 0, -1, 7, 4, -2)
    var contagemPositivos = 0
    var contagemNegativos = 0
    for (numero in numeros) {
        if (numero > 0) {
            contagemPositivos++
        } else if (numero < 0) {
            contagemNegativos++
        }
    }
    println("números positivos: $contagemPositivos")
    println("números negativos: $contagemNegativos")
}