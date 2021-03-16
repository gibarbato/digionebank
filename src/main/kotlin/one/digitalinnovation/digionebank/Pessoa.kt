package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Almir"
    var cpf:String = "002.589.951-88"

}

fun main(){
    val almir = Pessoa()

    println(almir.nome)
    println(almir.cpf)
}