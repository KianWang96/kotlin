import javafx.application.Application.launch
import kotlinx.coroutines.*
import java.lang.Integer.parseInt
import java.util.*
import com.google.common.base.Function
import com.google.common.base.Splitter
import com.google.common.collect.Lists
import com.google.common.collect.Maps
import com.google.common.collect.Sets
import kotlin.collections.ArrayList

/*class Test constructor(var a:Int) {
    var b:Int = 0
    constructor(b:Int, a:Int):this(a) {
        this.b = b
    }

    fun main(args: Array<String>) {
        *//*   val scanner = Scanner(System.`in`)
           val x = scanner.nextInt()
           val y = scanner.nextInt()
           print(x * y)*//*

        *//* for(i in 1..10 step 5) {
             print(i)
             print("\n")
             print(i.toString() + 1.toString() + '\n')
         }*//*

        *//*for(i in 10 downTo 1){
            print(i)
        }

        for(i in 1 until 10)
            print(i)*//*

        *//*val a = readLine()?.toInt()?:0
        val b = readLine()?.toInt()?:0
        val max = if(a > b) a else b
        print(max)*//*
*//*try{
    val a = readLine()?.toInt()?:0
    val b = readLine()?.toInt()?:0
    val result = a / b
    print(result)
} catch (e : Exception) {
    print(e.stackTrace)
}*//*

        *//*while (true) {
            val tmp = readLine()?.toInt()?:0
            when (tmp) {
                in 1..10 -> print("1-10")
                11 -> print("11")
                else -> print("else")
            }
        }*//*

        *//* val arr = intArrayOf(1,2,3,4,5)
         val input = readLine()
         tag@for ((index, value) in arr.withIndex()) {
             print("index is : $index and value is : $value \n")
             if (input == "a") {
                 break@tag
             }
         }*//*

    }
}*/
/*fun main() = runBlocking{
    val job = GlobalScope.launch { // 在后台启动一个新的协程，然后继续执行
        delay(1000L) // 不阻塞的延迟1s
        println("World!") // 延迟后打印
    }
    println("Hello,") // 当协程延迟时，主线程还在跑
    job.join()
}*/

/*fun main() = runBlocking{
    launch {
        delay(1L)
        print("World!")
    }
    println("Hello, ")
}*/

/*
fun main() = runBlocking { // this: CoroutineScope
    launch {
        doWorld()
    }

    coroutineScope { // Creates a new coroutine scope
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope") // This line will be printed before nested launch
    }

    println("Coroutine scope is over") // This line is not printed until nested launch completes
}

private suspend fun doWorld() {
    delay(200L)
    println("Task from runBlocking")
}
*/

/*
fun main() = runBlocking {
    repeat(100000) { // launch a lot of coroutines
        launch {
            delay(1000L)
            print(".")
        }
    }
}*/

fun main() {
    var arr = Splitter.on(" ").splitToList(readLine())
    var intArr = mutableListOf<Int>()
    var res:Int = 0
    for (ele in arr) {
        intArr.add(ele.toInt())
    }
    for (ele in intArr) {
        res += ele
    }
    println(res)
    intArr.map(::println)
}
