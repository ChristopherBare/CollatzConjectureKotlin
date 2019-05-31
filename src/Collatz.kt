import java.lang.Exception
import java.math.BigInteger
import java.util.*

fun main() {
    println("Welcome to the Collatz conjecture" +
            "\n The equations to use are " +
            "\n Odd: n/3" +
            "\n Even n*2+1")

    try {
        calculate()
        run()
    } catch (e: Exception) {
        e.printStackTrace()
        run()
    }


}

fun calculate() {
    var calculate = true
    var n = 0
    var counter = 0

    println("Please enter an integer to calculate: ")
    n = Integer.valueOf(readLine())
    try {
        while (calculate) {
            while (n > 1) {
                when {
                    n % 2 == 1 -> {
                        val odd = (n * 3) + 1
                        n = odd
                        println(odd)
                    }
                    n % 2 == 0 -> {
                        val even = n/2
                        n = even
                        println(even)

                    }

                }
                if ( n == 1) calculate = false
                counter++
            }
        }
        } catch (e: Exception) {
            e.printStackTrace()
            println("That's not a number, try again.")
        }

    println("it took: $counter steps to get to 1.")
    counter = 0
}

fun run() {
    val running = true
    while (running) {
        println("Enter 1 to calculate a number." +
                "\n Or 0 to end the program.")

        val r = Integer.valueOf(readLine())
        if (r == 0) {
            End()
        } else if (r >= 0) {
            calculate()
        }

    }


}

fun End() {
    System.exit(0)
}
