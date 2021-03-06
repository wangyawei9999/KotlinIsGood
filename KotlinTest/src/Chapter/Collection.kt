package Chapter

/**
 * Created by Administrator on 2017/6/26.
 */

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val strings = listOf("first", "second", "third")
    println(strings.last())
    val numbers = setOf(12, 14, 8)
    println(numbers.max())

    println("I love Kotlin")
}
