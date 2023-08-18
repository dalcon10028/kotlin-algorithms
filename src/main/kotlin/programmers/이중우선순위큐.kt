import java.util.PriorityQueue

class 이중우선순위큐 {
    fun solution(operations: Array<String>): IntArray {
        val queue1 = PriorityQueue<Int>()
        val queue2 = PriorityQueue<Int>(compareByDescending { it })

        operations.forEach {
            val (command, value) = it.split(" ")
            when (command) {
                "I" -> {
                    queue1.add(value.toInt())
                    queue2.add(value.toInt())
                }
                "D" -> {
                    if (queue1.isNotEmpty()) {
                        if (value == "1") {
                            val max = queue2.poll()
                            queue1.remove(max)
                        } else {
                            val min = queue1.poll()
                            queue2.remove(min)
                        }
                    }
                }
            }
        }

        return if (queue1.isEmpty()) {
            intArrayOf(0, 0)
        } else {
            intArrayOf(queue2.poll(), queue1.poll())
        }
    }
}