package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){

    val maria = Gerente(nome = "Maria Dolores", cpf = "888.548.741-25", salario = 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}
