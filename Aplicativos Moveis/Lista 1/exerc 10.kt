import kotlin.random.Random
fun main() {
    val numeroAleatorio = Random.nextInt(1, 101)
    var palpite: Int?
    var acerto = false
    println("Bem-vindo ao jogo de adivinhação!")
    println("Tente adivinhar o número entre 1 e 100.")
    do {
        print("seu palpite: ")
        palpite = readLine()?.toIntOrNull()
        if (palpite == null) {
            println(" insira um número válido.")
            continue
        }
        when {
            palpite < numeroAleatorio -> println(" é maior.")
            palpite > numeroAleatorio -> println(" é menor.")
            else -> {
                println("Você acertou o número")
                acerto = true
            } }
    } while (!acerto)
}