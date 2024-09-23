    println("quantos dias voc� quer registrar a temperatura?")
    val input = readLine() ?: ""
    val numDias = input.toIntOrNull() ?: return println("insira um n�mero v�lido.")
    val temperaturas = DoubleArray(numDias)

    for (i in 0 until numDias) {
        println("digite a temperatura do dia ${i + 1}:")
        val tempInput = readLine() ?: ""
        val temperatura = tempInput.toDoubleOrNull() ?: run {
            println("digite uma temperatura v�lida.")
            i--
            continue
        }
        temperaturas[i] = temperatura
    }
    val maxTemp = temperaturas.maxOrNull() ?: 0.0
    val minTemp = temperaturas.minOrNull() ?: 0.0
    println("a temperatura m�xima �: $maxTemp")
    println("a temperatura m�nima �: $minTemp")
}