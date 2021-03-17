package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val joao = Pessoa(nome = "Joao Silva", cpf = "002.122.344-12")
    println(joao.nome)
    println(joao.cpf)

    val jose = Funcionario(nome = "Jose Souza", cpf = "331.558.394-19")
    println(jose.nome)
    println(jose.cpf)
    println(jose.salario)

}