fun main() {
    print("Digite um texto para contar as vogais: ")
    val texto = readLine() ?: return
    val vogais = "aeiouAEIOU"
    var contagemVogais = 0

    for (caractere in texto) {
        if (caractere in vogais) {
            contagemVogais++
        }
    }
    println("O n�mero total de vogais no texto �: $contagemVogais")
}