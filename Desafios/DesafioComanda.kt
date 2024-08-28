fun main(){
    val precoCoxinha = 5f
    val precoCerveja = 15f

    println("Digite quantas coxinhas quer:")
    val coxinhaInput = readLine()

    if(coxinhaInput.isNullOrBlank()){
        println("Não pode ser null")
        return
    }

    val coxinha = coxinhaInput.toIntOrNull()

    if(coxinha == null){
        println("Não pode ser null")
        return
    } else if (coxinha <= 0){
        println("Não pode ser menor que zero")
    }

    println("Digite quantas cervejas quer:")
    val cervejaInput = readLine()

    if(cervejaInput.isNullOrBlank()){
        println("Não pode ser null")
        return
    }

    val cerveja = cervejaInput.toIntOrNull()

        if(cerveja <= 0){
        println("Não pode ser menor que zero")
        return
    }

    val comandaCoxinha = (precoCoxinha * coxinha)
    val comandaCerveja = (precoCerveja * cerveja)

    val somatoria = comandaCoxinha + comandaCerveja

    val taxa = (total * 0.1)

    val contaFinal = (total * 1.10)

    println("----------------------")
    println("       CONSOLE        ")
    println("----------------------")
    println(".: Lanchonete Julia :.")
    println("$coxinhaInput    R$ $precoCoxinha")
    println("$cervejaInput    R$ $precoCerveja")
    println("Somatória        R$ $somatoria")
    println("Taxa 10%         R$ $taxa")
    println("---------------------- ")
    println("Conta final      R$ $total")
    
    
    
}