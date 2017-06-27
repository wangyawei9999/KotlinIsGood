package Chapter4

/**
 * Created by Administrator on 2017/6/27.
 */

interface Clickable1 {
    fun click()
    fun showOff() = println("I am Clickable")
}

interface Focusable1 {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} Focusable")
    fun showOff() = println("I am Focusable")
}

class Button1: Clickable1, Focusable1 {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable1>.showOff()
        super<Focusable1>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button1()
    button.showOff()
    button.setFocus(true)
    button.click()
}