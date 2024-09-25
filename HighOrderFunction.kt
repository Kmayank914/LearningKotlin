fun main(){
    val addition=operationOnNumbers(5,6){x,y->x+y}
    val product=operationOnNumbers(5,6){x,y->x*y}
    println(addition)
    println(product)
}
fun operationOnNumbers(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b)
}