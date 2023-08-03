import kotlin.math.*

class 바탕화면_정리 {
    fun solution(wallpaper: Array<String>): IntArray {
        return wallpaper.foldIndexed(intArrayOf(Int.MAX_VALUE, Int.MAX_VALUE, 0, 0)) { index, answer, s,  ->
            s.indexOf('#').takeIf { it != -1 }?.let { first ->
                s.lastIndexOf('#').let { last ->
                    answer[0] = min(index, answer[0])
                    answer[1] = min(first, answer[1])
                    answer[2] = max(index + 1, answer[2])
                    answer[3] = max(last + 1, answer[3])
                }
            } ?: answer
            answer
        }
    }
}