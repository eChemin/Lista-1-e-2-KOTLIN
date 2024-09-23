fun main() {
    print("Digite o texto para contar os caracteres: ")
    val texto = readLine() ?: ""
    val contagemCaracteres = mutableMapOf<Char, Int>()
    for (caractere in texto) {
        contagemCaracteres[caractere] = contagemCaracteres.getOrDefault(caractere, 0) + 1
    }
    println("Contagem de caracteres:")
    for ((caractere, contagem) in contagemCaracteres) {
        println("$caractere: $contagem")
    }
}