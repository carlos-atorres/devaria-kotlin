import classes.Produto

/*
* -> Escrever um programa - OK
* -> que recebe alguns produtos como argumento e
* -> validar se esse produtos estão na lista de itens disponíveis do mercado.
* -> Caso estejam, avisar o usuário quais produtos estão disponíveis e quais não estão e,
* -> por último, exibir a lista de produtos disponíveis ordenados por ordem alfabética do mercado,
* para que o usuário possa pedir na próxima vez.
*
* */

fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        println("Favor informar a lista de produtos que deseja comprar")
        return
    }
    val itensDisponiveis =arrayOf(
        Produto(nome="Arroz", preco=35.10),
        Produto(nome="Azeite", preco=16.90),
        Produto(nome="Carne", preco=39.50),
        Produto(nome="Cerveja", preco=3.99),
        Produto(nome="Feijão", preco=11.05)
    )

    val itensSelecionadosDisponiveis = itensDisponiveis.filter { produto ->
        argumentos.any { argumento ->
            argumento.equals(produto.nome, ignoreCase = true)
        }

    }
    for(itemSelecionadoDisponivel in itensSelecionadosDisponiveis){
        println(itemSelecionadoDisponivel.exibirDadosProduto())
    }

    // -> e quais não estão disponíveis
    val argumentosSelecionadosNaoDisponiveis = argumentos.filter { argumento -> !itensDisponiveis.any {
            produto -> produto.nome.equals(argumento, ignoreCase = true) } }

    argumentosSelecionadosNaoDisponiveis.forEach{
        argumento -> println("Este produto infelizmente nós não temos: $argumento")
    }

}
