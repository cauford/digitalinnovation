package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "077.032.045-09",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}