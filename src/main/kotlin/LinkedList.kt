class LinkedList {
    private var head: Node? = null
    private var tail: Node? = head
    fun prepend(node: Node) {
        if(head==null)  tail = node
        node.setNextNode(head)

        head = node

    }

    fun getHead(): Node? {
        return head
    }

    fun getTail(): Node? {
        return tail
    }
    fun printNodes() {
        var current = head
        while (current != null) {
            println(current)
            current = current.getNextNode()
        }
    }

fun append(node: Node){
    tail?.setNextNode(node)
    tail = node
}

}