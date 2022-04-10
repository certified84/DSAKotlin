import data_structures.LinkedList
import data_structures.Node
import kotlin.math.pow

fun main(args: Array<String>) {

    val names = arrayOf("Sammie", "Shola", "Shollz", "Seun", "Saul")
//    showOutput(names)

//    showNodes()

    val linkedList = LinkedList<Int>()
    linkedList.push(1).push(2).push(3)
//    println(linkedList)

//    val n = readLine()!!
//    fibonacciSeries(n.toInt())

//    val str = readLine()!!
//    palindrome(str)
//    checkArmstrong(0, 9999)

//    println(occurrence('2'))
//    println(reverse(1385757))
//    println(areaOfCircle(readln().toDouble()))
//    println(areaOfTriangle(readLine()!!.toDouble(), readLine()!!.toDouble()))
//    println(areaOfRectangle(readLine()!!.toDouble(), readLine()!!.toDouble()))
//    println(areaOfParallelogram(readLine()!!.toDouble(), readLine()!!.toDouble()))
//    println(areaOfRhombus(readLine()!!.toDouble(), readLine()!!.toDouble()))
//    println(areaOfEquilateralTriangle(readLine()!!.toDouble()))
//    println(perimeterOfCircle(readLine()!!.toDouble()))
//    voters()

}

fun forLoop() {
    val x = 1..10
    val y = 1 until 10
    for (i in 1..10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }
}

fun leapYear(n: Int): String {
    if (n % 4 == 0) {
        if (n % 100 == 0) {
            return if (n % 400 == 0) {
                "$n is a Leap Year"
            } else "$n is a not a Leap Year"
        }
        return "$n is a Leap Year"
    } else return "$n is a not a Leap Year"

    fun print(n: Int) {
        println(leapYear(n))
    }
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return n * factorial(n - 1)
}

//fun factorial(n: Int): Int {
//    var factorial = 1
//    if (n == 0 || n == 1) return 1
//    for (i in 1 until n) factorial *= i
//    return factorial * n
//}

fun largest(): String {
    val arr = mutableListOf<Int>()
    var largest = 0
    while (true) {
        val n = readLine()!!.toInt()
        if (n == 0) break
        arr.add(n)
    }
    for (i in arr.indices) {
        val temp = arr[i]
        if (temp > largest) largest = temp
    }
    return "The largest digit is $largest"
}

fun sum(): String {
    val arr = mutableListOf<Int>()
    var sum = 0
    while (true) {
        val n = readLine()!!.toInt()
        if (n == 0) break
        arr.add(n)
    }
    for (i in arr.indices) {
        val temp = arr[i]
        sum += temp
    }
    return "The sum of the digits is $sum"
}

fun subtractProductAndSum(n: Int): Int {
    val str = n.toString()
    var product = 1
    var sum = 0
    if (str.length == 1) {
        return n.toInt() - n.toInt()
    }
    str.forEach {
        product *= it.toString().toInt()
        sum += it.toString().toInt()
    }
    return product - sum
}

private fun perimeterOfCircle(radius: Double): Double {
    return 2 * Math.PI * radius
}

private fun areaOfEquilateralTriangle(a: Double): Double {
    return ((3.0.pow(.5) / 4.0) * a * a)
}

private fun areaOfRhombus(p: Double, q: Double): Double {
    return (p * q) / 2
}

private fun areaOfParallelogram(base: Double, height: Double): Double {
    return base * height
}

private fun areaOfRectangle(length: Double, width: Double): Double {
    return length * width
}

private fun areaOfTriangle(base: Double, height: Double): Double {
    return (base * height) / 2
}

private fun areaOfCircle(r: Double): Double {
    return r * r * Math.PI
}

private fun reverse(n: Int): Int {
    var num = n
//    return n.toString().reversed().toInt()

//    OR
//    /*
    var ans = 0
    while (num > 0) {
        ans = ans * 10 + num % 10
        num /= 10
    }
    return ans
//     */
}

private fun occurrence(n: Char): Int {
    val str = "1385757879"
    var count = 0
    str.forEach { s -> if (s == n) count++ }

//    OR
    /*
    var num = 1385757879
    while (num > 0) {
        if (num % 10 == n.toString().toInt()) count++
        num /= 10
    }
     */
    return count
}

data class Student(val name: String, val age: Int)

private fun students() {
    val students = listOf(
        Student("Sammie", 22), Student("Shola", 35), Student("Shollz", 25), Student("Seun", 19)
    )
    println(students.sortedBy { it.age }.drop(3))
    println(students.sortedBy { it.age }.dropLast(2))
}

data class Citizens(val name: String, val age: Int)

private fun voters() {
    val citizens = listOf(
        Citizens("Naruto", 12),
        Citizens("Hinata", 19),
        Citizens("Sasuke", 15),
        Citizens("Sakura", 22),
        Citizens("Itachi", 12),
        Citizens("Kakashi", 20),
    )
    val (voters, nonVoters) = citizens.partition { it.age >= 18 }
    println(voters)
    println(nonVoters)
}

private fun checkArmstrong(x: Int, y: Int) {
    var armstrongs = ""
    for (i in x until y) {
        if (checkArmstrong(i) == i.toDouble()) armstrongs += "$i "
    }
    println("Armstrong numbers between $x and $y are $armstrongs")
}

private fun checkArmstrong(n: Int): Double {
    val num = n.toString()
    var total = 0.0
    var str = ""
    if (num.length <= 3) for (element in num) {
        total += element.toString().toDouble().pow(3)
    }
    else if (num.length == 4) for (element in num) {
        total += element.toString().toDouble().pow(4)
    }
//    if (n.toDouble() == total)
//        println("$n is an armstrong number")
//    else
//        println("$n is not an armstrong number")
    return total
}

private fun palindrome(str: String) {
    if (str.equals(str.reversed(), ignoreCase = true)) println("$str is a palindrome")
    else println("$str is not a palindrome")
}

private fun fibonacciSeries(n: Int) {

    var n1 = 0
    var n2 = 1
    var n3 = 0

    if (n == 0) {
        println(n1)
        return
    }

    print("$n1 $n2")
    for (i in 2 until n) {
        n3 = n1 + n2
        print(" $n3")
        n1 = n2
        n2 = n3
    }
}

fun showNodes() {
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)

    node1.next = node2
    node2.next = node3
    println(node1)
}

fun showOutput(names: Array<String>) {
    for (index in names.indices) {
        println("Index: $index, Element: ${names[index]}")
    }
}

// O(1)
fun sumFromOne(n: Int): Int {
    return n * (n + 1) / 2
}

class College(val name: String, val student: Student) {

}