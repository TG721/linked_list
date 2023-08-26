class Node (private val value: Int?) {
    private var next: Node? = null
    fun getNextNode(): Node? {
        return next
    }

    fun getNodeValue(): Int? {
        return value
    }

    fun setNextNode(next: Node?){
        this.next = next

    }

    override fun toString(): String {
        return "Node - ${this.value}"
    }
}