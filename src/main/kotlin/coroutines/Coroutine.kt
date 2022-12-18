package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {
    println("MAin thread ${Thread.currentThread().name}")
    thread {
        println("FAKE work start : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work Finish : ${Thread.currentThread().name}")

    }
    GlobalScope.launch {
        println("Coroutine work start : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Coroutine work Finish : ${Thread.currentThread().name}")

    }
 Thread.sleep(3000)
 println("Main Program ${Thread.currentThread().name}")

}