un main() {
    print("digite um número para verificar se é primo: ")
    val numero = readLine()?.toIntOrNull() ?: return

    if (numero <= 1) {
        println("$numero não é primo.")
        return
    }
    var ePrimo = true
    for (i in 2 until numero) {
        if (numero % i == 0) {
            ePrimo = false
            break
        }
    }
    if (ePrimo) {
        println("$numero é primo.")
    } else {
        println("$numero não é primo.")
    }
}