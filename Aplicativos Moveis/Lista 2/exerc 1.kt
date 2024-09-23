fun main() {
    println("quantos alunos voc� tem na turma?")
    val input = readLine() ?: ""
    val numAlunos = input.toIntOrNull()

    if (numAlunos == null || numAlunos <= 0) {
        println("insira um n�mero v�lido de alunos.")
        return
    }
    val idades = IntArray(numAlunos)
    for (i in 0 until numAlunos) {
        println("digite a idade do aluno ${i + 1}:")
        val idadeInput = readLine() ?: ""
        val idade = idadeInput.toIntOrNull()
        if (idade == null || idade < 0) {
            println("insira uma idade v�lida.")
            i--
        } else {
            idades[i] = idade
        }}
    val soma = idades.sum()
    val media = soma.toDouble() / numAlunos
    println("a m�dia de idades dos alunos �: $media")
}