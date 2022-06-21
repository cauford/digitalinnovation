package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Carlos"
    var cpf : String = "123.123.123-12"
}

fun main() {
    val Carlos = Pessoa()

    println(Carlos.nome)
    println(Carlos.cpf)
}