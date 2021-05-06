
/*
-> Escrever um programa que recebe alguns produtos como argumentos - OK
-> validar se esses produtos estão na lista de itens disponíveis do mercado - OK

Caso estejam, avisar o usuário quais produtos tem e quais não tem e,

por último, exibir a lista de produtos disponíveis ordenados por ordem alfabética do mercado,
para que o usuário possa pedir na próxima vez.
 */

fun main(argumentos : Array<String>) {
    //validar se vieram produtos nos argmentos
    if(argumentos.isEmpty()) {
        println("Favor informar sua lista de produtos para verificarmos a disponibilidade")
        return
    }

    val produtosDisponiveis = arrayOf("Pão", "Manteiga", "Bolacha", "Arroz", "Feijão")

    val produtosRequisitadosDisponiveis = argumentos.filter { produtoRequisitado -> produtosDisponiveis.contains(produtoRequisitado)}

    for(produtoRequisitadodisponivel in produtosRequisitadosDisponiveis){
        println("Este produtos nós temos: $produtoRequisitadodisponivel")
    }

    val produtosRequisitadosNaoDisponiveis = argumentos.filter { produtoRequisitado -> !produtosDisponiveis.contains(
        produtoRequisitado)
    }

    produtosRequisitadosNaoDisponiveis.forEach { produtoNaoDisponivel -> println("Este produto nós " +
     "não temos: $produtoNaoDisponivel")}

    val produtosOrdenados = produtosDisponiveis.sortedBy { produto -> produto }
    produtosOrdenados.forEach { produto -> println("Confira este produto disponível: $produto") }

}

