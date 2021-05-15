package classes

//esta classe já possui get e set, em somente uma linha de código
class Produto (val nome : String, val preco : Double){
    fun exibirDadosProduto() : String {
        return "Produto nome: $nome e valor R$ $preco"
    }
}