import java.security.spec.MGF1ParameterSpec

fun main(){
   greetperson("james")
    modulus(9,4)
    sum(15,9)
    sum(40,12)
    interesting("Happy")


}

   fun greetperson(name: String){
    println("Hello"+name)
}

fun modulus(num1:Int,num2:Int){
    var remainder = num1 % num2
    println(remainder)
}

fun sum(num1:Int,num2:Int){
        var sum =num1+num2
        println(sum)
}

fun interesting(angeth: String){
    println("Happy")
}


