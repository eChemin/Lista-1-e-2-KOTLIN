fun main() {
    val quantidade = 10
    var a = 0
    var b = 1
    println("Os primeiros $quantidade n�meros da sequ�ncia de Fibonacci s�o:")
    for (i in 1..quantidade) {
        println(a)
        val proximo = a + b
        a = b
        b = proximo
    }
}