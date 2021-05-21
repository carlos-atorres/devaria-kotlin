fun main() {
    println("Favor informar o nome do convidado:")
    val nome = readLine()

    if (nome.isNullOrEmpty() || nome.isNullOrBlank()){
        return
    }

    println("Favor informar a idade do convidado:")
    val idade = readLine()?.toIntOrNull()

    if(idade == null || idade <= 0){
        println("A idade informada não é válida!")
        return
    }

    var estaConvidado = false
    when(nome){
        "Kaique" -> estaConvidado = true
        "Ale" -> estaConvidado = true
        "Ricardo" -> estaConvidado = true
        "Carlos" -> estaConvidado = true
        else -> estaConvidado = false
        }
    if(estaConvidado && idade >= 18){
        println("Bem vindo a festa Kotlin Devaria 2021!")
    }else if(!estaConvidado){
        println("Você não está na lista de convidados, verifique com quem lhe convidou")
    }else{
        println("Você não tem idade mínima permitida para entrar")
    }

}