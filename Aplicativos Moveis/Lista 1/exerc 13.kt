fun main() {
    println("Jogo de Pedra, Papel e Tesoura")
    print("Jogador 1, escolha (Pedra, Papel ou Tesoura): ")
    val escolhaJogador1 = readLine()?.trim()?.toLowerCase()
    print("Jogador 2, escolha (Pedra, Papel ou Tesoura): ")
    val escolhaJogador2 = readLine()?.trim()?.toLowerCase()

    if (escolhaJogador1 !in listOf("pedra", "papel", "tesoura") || escolhaJogador2 !in listOf("pedra", "papel", "tesoura")) {
        println("Escolha inválida. Cada jogador deve escolher entre Pedra, Papel ou Tesoura.")
        return
    }
    val resultado = when {
        escolhaJogador1 == escolhaJogador2 -> "Empate!"
        (escolhaJogador1 == "pedra" && escolhaJogador2 == "tesoura") ||
        (escolhaJogador1 == "papel" && escolhaJogador2 == "pedra") ||
        (escolhaJogador1 == "tesoura" && escolhaJogador2 == "papel") -> "Jogador 1 vence!"
        else -> "Jogador 2 vence!"
    }
    println("Resultado: $resultado")
}