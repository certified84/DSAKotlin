import data_structures.LinkedList
import data_structures.Node

fun main(args: Array<String>) {

    val names = arrayOf("Sammie", "Shola", "Shollz", "Seun", "Saul")
//    showOutput(names)

//    showNodes()

    val linkedList = LinkedList<Int>()
    linkedList.push(1).push(2).push(3)
    println(linkedList)
}

fun showNodes() {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3
    println(node1)
}

fun showOutput(names: Array<String>) {
    for (index in names.indices) {
        println("Index: $index, Element: ${names[index]}")
    }
}

// O(1)
fun sumFromOne(n: Int): Int {
    return n * (n + 1) / 2
}