fun main() {
    println("Hello World")


    val items : List<String> = listOf("apple", "banana", "Orange")
    
    for(idx in items.indices) {
        println("index is $idx, value is ${items[idx]}")
    }

}