class Usuario(val email: String, val senha: String) {
    init {
        require(Companion.validarEmail(email)) { "Email inválido." }
        require(Companion.validarSenha(senha)) { "Senha deve ter pelo menos 8 caracteres, incluindo uma letra e um número." }
    }
    companion object {
        fun validarEmail(email: String): Boolean {
            val emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$".toRegex()
            return emailRegex.matches(email)
        }
        fun validarSenha(senha: String): Boolean {
            val senhaRegex = "^(?=.[A-Za-z])(?=.\\d)[A-Za-z\\d]{8,}$".toRegex()
            return senhaRegex.matches(senha)
        }
    }
}
fun main() {
    try {
        val usuario1 = Usuario("usuario@exemplo.com", "senha123")
        println("Usuário ${usuario1.email} cadastrado com sucesso!")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
    try {
        val usuario2 = Usuario("emailinvalido", "123456")
        println("Usuário ${usuario2.email} cadastrado com sucesso!")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
//essa nao consegui fazer direito