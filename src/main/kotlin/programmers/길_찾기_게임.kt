class 길_찾기_게임 {

    class Node(val index: Int, val x: Int, val y: Int) {
        var left: Node? = null
        var right: Node? = null

        fun add(node: Node) {
            if (node.x < x) {
                if (left == null) {
                    left = node
                } else {
                    left!!.add(node)
                }
            } else {
                if (right == null) {
                    right = node
                } else {
                    right!!.add(node)
                }
            }
        }

        fun preOrder(list: MutableList<Int>) {
            list.add(index)
            left?.preOrder(list)
            right?.preOrder(list)
        }

        fun postOrder(list: MutableList<Int>) {
            left?.postOrder(list)
            right?.postOrder(list)
            list.add(index)
        }
    }

    fun solution(nodeinfo: Array<IntArray>): Array<IntArray> {
        val nodes = nodeinfo.mapIndexed { index, ints -> Node(index + 1, ints[0], ints[1]) }
            .sortedWith(compareByDescending<Node> { it.y }.thenBy { it.x })
        val root = nodes[0]
        nodes.forEach { node ->
            if (node != root) {
                root.add(node)
            }
        }
        val preOrder = mutableListOf<Int>()
        val postOrder = mutableListOf<Int>()
        root.preOrder(preOrder)
        root.postOrder(postOrder)
        return arrayOf(preOrder.toIntArray(), postOrder.toIntArray())
    }
}