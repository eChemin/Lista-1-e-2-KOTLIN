fun main() {
    println("digite um numero:")
    val numero = readLine()!!.toInt()
    if (numero % 2 == 0) {
        println("$numero � par.")
    } else {
        println("$numero � �mpar.")
    }
}