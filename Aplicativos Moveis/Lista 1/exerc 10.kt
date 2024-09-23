import kotlin.random.Random
fun main() {
    val numeroAleatorio = Random.nextInt(1, 101)
    var palpite: Int?
    var acerto = false
    println("Bem-vindo ao jogo de adivinha��o!")
    println("Tente adivinhar o n�mero entre 1 e 100.")
    do {
        print("seu palpite: ")
        palpite = readLine()?.toIntOrNull()
        if (palpite == null) {
            println(" insira um n�mero v�lido.")
            continue
        }
        when {
            palpite < numeroAleatorio -> println(" � maior.")
            palpite > numeroAleatorio -> println(" � menor.")
            else -> {
                println("Voc� acertou o n�mero")
                acerto = true
            } }
    } while (!acerto)
}