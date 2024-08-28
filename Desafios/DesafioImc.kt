import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var sair: Char

    do {
        coletarDados()
        println("Digite [c] para continurar ou [s] para sair:")
        sair = scanner.next()[0]
    } while (sair != 's')  
}

fun coletarDados(){
    val scanner = Scanner(System.`in`)
    var peso: Float
    var altura: Float

    println("Digite seu peso:")
    peso = scanner.nextFloat()

    println("Digite sua altura:")
    altura = scanner.nextFloat()

    val imc = coletarImc(peso, altura)
    println("Seu IMC é: %.2f".format(imc))

 
     when {
        imc < 18.5 -> println("Excesso de magreza")
        imc < 25 -> println("Peso normal")
        imc < 30 -> println("Excesso de peso")
        imc < 35 -> println("Obesidade Grau I")
        imc < 40 -> println("Obesidade Grau II")
        else -> println("Obesidade Grau III")
    }
}

fun coletarImc(peso: Float, altura: Float): Float{
    val soma = peso / (altura * altura)
    return soma
}