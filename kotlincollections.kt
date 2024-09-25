fun main(){
    // Immutable list
   /* val fruits=listOf("Banana","Apple","Mango")
    for(items in fruits){
        println(items)
    } 

    // Mutable list
    val colours=mutableListOf("Green","Orange","Blue","Black")
    // Adding elements
    colours.add("Yellow")
    // Removing elements
    colours.removeAt(0)
    // Updating elements
    colours[0]="Grey"
    for(items in colours){
        println(items)
    } 

    // Immutalbe set
    val colours = setOf("Red","Green","Yellow")
    for(items in colours){
        println(items)
    } 

    // Mutable Set
    val colours = mutableSetOf("Green","Orange","Blue","Black")
    // Adding elements
    colours.add("Yellow")
    // Removing elements
    colours.remove("Green")
    // Updating elements
    colours.remove("Orange")
    colours.add("Grey")
    for(items in colours){
        println(items)
    }

    //Immutable maps
    val fruits  = mapOf("Banana" to 8,"Mango" to 12,"Cherry" to 15)
    val quan=fruits["Banana"]
    println("The quantity of banana is "+quan) */

    //Mutable maps
    val friutsprice=mutableMapOf("Mango" to 8.8,"Apple" to 6,"Banana" to 6.5)
    // Adding new elements
    friutsprice.put("Orange",7)
    // Updating price of mango
    friutsprice["Mango"]=9

    for(items in friutsprice){
        println(items)
    }
}