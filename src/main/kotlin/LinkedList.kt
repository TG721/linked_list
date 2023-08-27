class LinkedList {
    private var head: Node? = null
    private var tail: Node? = head
    public var size: Int = 0
    fun prepend(node: Node) {
        if (head == null) tail = node
        node.setNextNode(head)
        head = node
        size++
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

    fun append(node: Node) {
        tail?.setNextNode(node)
        tail = node
        size++
    }

    fun isEmpty(): Boolean {
        return head == null
    }

    fun findAt(index: Int): Int? {
        var currentPos = 0
        var current = head
        if(index < 0) throw Exception("Index can't be negative integer")
        if(index<size) {
            while (currentPos <= index) {
                if(currentPos == index) {
                    return current?.getNodeValue()
                }
                currentPos++
                current = current?.getNextNode()
            }
        } else {
            throw Exception("Index out of range bound")
        }
        return null
    }
    fun removeAtIndex(index: Int) {
        var currentPos = 0
        var current = head
        if(index < 0) throw Exception("Index can't be negative integer")

        if(index<size) {
            while (currentPos < index) {
                if(currentPos == index-1) {
                    current?.setNextNode(current.getNextNode()?.getNextNode())

                }
                if(currentPos==size-1) tail = current
                currentPos++
                current = current?.getNextNode()
            }
        } else throw Exception("Index out of range bound")
        size--
    }
}