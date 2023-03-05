// write your code here
fun getLastDigit(number: Int): Int = number.toString().last().digitToInt()

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
