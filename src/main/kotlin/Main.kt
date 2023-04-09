fun main() {
    /*
    1 - Faça um loop for que imprima todos os números de 1 a 10:
    */
    for(number: Int in 1..10){
        print("$number ")
    }
    println()

    /*
    2 - Faça um loop for que imprima todos os
    números pares de 0 a 20:
     */
    for (numberPair: Int in 0..20){
        if(numberPair%2==0){
            print("$numberPair ")
        }
    }
    println()

    /*
    3 - Faça um loop for que imprima
    todos os números ímpares de 10 a 0:
     */
    for(numberImpar:Int in 10 downTo 0){
        if(numberImpar%2 != 0){
            print("$numberImpar ")
        }
    }
}