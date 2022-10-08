fun main() {
    // анонимная функция fun() без параметров
    val test = fun() = println("123")
    test()

    // анонимная функция с параметрами - тип возвращ. значение Int
    val test2 = fun(x: Int, y: Int): Int = x * y
    val result2 = test2(5,6)

    // анонимная функция с параметрами - тип возвращ. значение Unit
    val test3 = fun(x: Int, y: Int) = println("$x $y")
    val result3 = test3(10,12)

    // вызовы - анонимная функция как аргумент
    ex2(9,8,fun(x: Int, y: Int) = println("$x $x $y $y"))
    ex4(12,11,fun(x: Int, d: Double) = Math.pow(x.toDouble(),d))

    // возвращение анонимной функции как результат
    val r1 = bigFun(1) // здесь будет сама функция
    println(r1(5,6))

}

/*
fun ex1(x: Int, y: Int, action: test2) {

}
 */


fun bigFun(key: Int): (Int, Int) -> Int {
    when(key) {
        1 -> return fun(x: Int, y: Int): Int = x - y
        2 -> return fun(x: Int, y: Int): Int = 2 * x + 2 * y
        else -> return fun(x: Int, y: Int): Int = 100
    }
}

fun ex2(x: Int, y: Int, test: (Int, Int) -> Unit) {
    test(555,666)
}











fun ex3(x: Int, y: Int, test: (Int, Double) -> Unit) {
    test(5,6.0)
}

fun ex4(x: Int, y: Int, test: (Int, Double) -> Double) {
    println(test(2,3.0))
}

