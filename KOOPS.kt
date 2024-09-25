fun main(){
   /*  sayHello("Mayank") 

    var sum=sumofTwo(3,5)
    println(sum) 
    var sum2=sumofTwo(3.7,4.8)
    println(sum2) 

    // Obejcts
    val robot1:robot=robot("Mayank")
    robot1.walk()
    robot1.speak("Hello")
    val robot2:robot=robot("Mansi")
    robot2.walk()
    robot2.speak("Mayank is better") */

    val orobot=ordinaryrobot("Mandem")
    orobot.turnonlight()
    val srobot=superrobot("Meta")
    srobot.cleaning()
    val frobot=firerobot("Music")
    frobot.fire()
}

// Function Declaration
/*fun sayHello(name : String){
    println("Hello, $name")
}*/

// Return type
/*fun sumofTwo(x : Int,y : Int) :Int {
    var z=x+y
    return z
} */

// Function Overloading
/*fun sumofTwo(x:Double,y:Double):Double{
    var z=x+y
    return z
} */

// Classes
/*class robot(val name:String){
    fun walk(){
        println("The Robot is walking")
    }
    fun speak(message:String){
        println("$name says : $message")
    }
}*/

// Inheritance
class ordinaryrobot( name:String) :generalrobot(name){
   
    fun turnonlight(){
        println("The lights are turned on")
    }
}
class superrobot( name:String):generalrobot(name){
    
    fun cleaning(){
        println("This robot can clean")
    }
}
class firerobot( name:String):generalrobot(name){
    
    fun fire(){
        println("This robot can fire")
    }
}
open class generalrobot(val name:String){     // generalrobot is superclass of ordinary,super and firerobot
    fun walk(){
        println("The Robot is walking")
    }
    fun speak(message:String){
        println("$name says : $message")
    }
    init{  //init block
        println("A new robot is created")
    }
    
}