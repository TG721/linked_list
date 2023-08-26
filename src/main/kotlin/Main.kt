fun main() {
    println("Hello, world!!!")
    val a = LinkedList()
    a.prepend(Node(2))
    a.prepend(Node(3))
    a.prepend(Node(6))
    a.prepend(Node(1))
    a.append(Node(10))
    a.printNodes()
}