package data_structures

class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

    override fun toString() = if (isEmpty()) "Empty list" else head.toString()

    //    Add a node to the front of the list
    fun push(value: T): LinkedList<T> {
        head = Node(value, next = head)
        if (tail == null)
            tail = head
        size++
        return this
    }

    //    Add a node to the end of the list
    fun append(value: T) {
        tail = Node(value)
//        If list isEmpty(), update head and tail to new Node()
        if (isEmpty()) {
            push(value)
            return
        }
//        In other cases, create a new node after the current tail
        tail?.next = Node(value)
//        Since this is tail-end insertion, your new node is also the tail of the list
        tail = tail?.next
        size++
    }

    //    Get note at particular position
    fun nodeAt(position: Int): Node<T>? {

//        Create a new reference to head and keep track of the current number of traversals
        var currentNode = head
        var currentPosition = 0

//        Use the loop to move the reference down the list until you reach the desired index
        while (currentNode != null && currentPosition < position) {
            currentNode = currentNode.next
            currentPosition++
        }
        return currentNode
    }

    //    Insert Node at a particular position
    fun insert(value: T, afterNode: Node<T>): Node<T> {

//        If afterNode is tail, append()
        if (tail == afterNode) {
            append(value)
            return tail!!
        }

//        Else, create a new Node and link it to the next node of the list
        val newNode = Node(value = value, next = afterNode.next)

//        Next, reassign the next value of the specified node to link it to the new node that you just created.
        afterNode.next = newNode
        size++
        return newNode
    }
}