package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val pedro = Cliente(
        nome = "Pedro Cardoso",
        cpf = "951.843.753-46",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(pedro)

    TesteAutenticacao().autentica(pedro)
}
