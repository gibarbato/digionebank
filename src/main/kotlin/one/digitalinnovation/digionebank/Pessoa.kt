package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Almir"
    var cpf: String = "002.589.951-88"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val almir = Pessoa()
    println(almir.pessoaInfo())
  }