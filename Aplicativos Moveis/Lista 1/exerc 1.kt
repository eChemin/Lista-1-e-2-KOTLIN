fun main() {
    println("Digite a nota da P1:")
    val nota1 = readLine()!!.toDouble()
    println("nota P2:")
    val nota2 = readLine()!!.toDouble()
    println("nota P3:")
    val nota3 = readLine()!!.toDouble()
    val media = (nota1 + nota2 + nota3) / 3
    if (media >= 7.0) {
        println("media: $media - aprovado")
    } else {
        println("media: $media - reprovado")
    }
}