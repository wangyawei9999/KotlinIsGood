package Chapter4

/**
 * Created by Administrator on 2017/6/27.
 */

interface Clickable {
    fun click()
}

class Button: Clickable {
    override fun click() = println("I was Clicked")
}

fun main(args: Array<String>) {
    Button().click()
}