fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    val doubledList2 = list.map {  if (it > 2) it * 2 else it }
    println(doubledList2) // Correct handling - creates new elements

    //Alternative solution using let for better readability
    val doubledList3 = list.map { it.let { if (it > 2) it * 2 else it } }
    println(doubledList3)
}