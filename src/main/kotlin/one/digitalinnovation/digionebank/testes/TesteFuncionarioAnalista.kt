package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main(){

    val jose = Analista(nome = "Jose Souza", cpf = "331.558.394-19", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(jose)
}
