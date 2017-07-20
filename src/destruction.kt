
data class A(val a: Int, val b: Double)

typealias ALambda = (A, Int) -> Int

fun main(args: Array<String>) {
    val a1 = A(1, 2.0)

    val (c1, c2) = a1

    println("$c1, $c2")

    val aMap = mapOf("a" to 1, "b" to 2, "c" to 3)

    for ((key, value) in aMap) {
        println("$key, $value")
    }

    val bMap = hashMapOf("a" to 1, "b" to 2, "c" to 3)
    bMap["d"] = 4

    for ((key, value) in bMap) {
        println("$key, $value")
    }

}