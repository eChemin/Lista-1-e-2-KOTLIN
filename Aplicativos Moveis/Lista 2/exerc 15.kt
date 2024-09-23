class MinhaClasse {
    companion object {
        var contadorInstancias = 0
            private set
        fun incrementarContador() {
            contadorInstancias++
        } }
    init {
        incrementarContador()
    }}
fun main() {
    val instancia1 = MinhaClasse()
    val instancia2 = MinhaClasse()
    val instancia3 = MinhaClasse()
    println("total de instâncias criadas: ${MinhaClasse.contadorInstancias}")
}