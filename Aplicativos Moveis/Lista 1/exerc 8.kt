un main() {
    print("digite um n�mero para verificar se � primo: ")
    val numero = readLine()?.toIntOrNull() ?: return

    if (numero <= 1) {
        println("$numero n�o � primo.")
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
        println("$numero � primo.")
    } else {
        println("$numero n�o � primo.")
    }
}