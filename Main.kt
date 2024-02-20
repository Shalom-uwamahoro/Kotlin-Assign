fun main(){
    greetingName("Shalom")
    var y = modulus(27, 5)
    println(y)
    println(add(20,15.34,20.3, 40))
    interestingFactAboutMe()


}
fun greetingName(name: String){
    var name = "Hello ${name}"
    println(name)
}
fun modulus(num1: Int, num2: Int): Int{
    return num1%num2
}
fun add(num3: Int, num4:Double, num5: Double, num6: Int): Double{
    var result = num3+num4+num5+num6
    return result
}
fun interestingFactAboutMe(){
    var fact = "I have two names of the same meaning"
    println(fact)
}