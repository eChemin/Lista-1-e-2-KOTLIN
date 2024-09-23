class MeuObjeto {
    val id: Int
    companion object {
        private var proximoId = 1
        fun gerarId(): Int {
            return proximoId++
        }}
    init {
        id = gerarId()
    }}
fun main() {
    val objeto1 = MeuObjeto()
    val objeto2 = MeuObjeto()
    val objeto3 = MeuObjeto()

    println("ID do objeto 1: ${objeto1.id}")
    println("ID do objeto 2: ${objeto2.id}")
    println("ID do objeto 3: ${objeto3.id}")
}