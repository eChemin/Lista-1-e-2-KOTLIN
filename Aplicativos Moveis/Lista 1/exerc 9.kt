fun main() {
    val quantidade = 10
    var a = 0
    var b = 1
    println("Os primeiros $quantidade números da sequência de Fibonacci são:")
    for (i in 1..quantidade) {
        println(a)
        val proximo = a + b
        a = b
        b = proximo
    }
}