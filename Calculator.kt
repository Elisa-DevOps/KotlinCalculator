//Project: Kotlin Calculator
//Purpose: Basic Calculator - add, subtract, multiply, divide, power
//Author: Elisa Aldridge
class Calculator (val name: String) {

    init {
      println("$name owns this calculator.")
    }
  
    fun add(num1: Int, num2: Int): Int {
      println("Adding $num1 + $num2")
      return num1 + num2
    }
  
    fun multiply(num1: Int, num2: Int): Int {
      println("Multiplying $num1 * $num2")
      return num1 * num2
    }
  
    fun divide(num1: Int, num2: Int): Any {
      println("dividing $num1 / $num2")
      if (num2 == 0) {
        println("Error, cannot divide by 0")
        return 0
      } else {
        return num1 / num2
      }
    }
  
    fun power(num1: Int, num2: Int): Int{
      println("Power of $num1 ^ $num2")
      var result = 1
      for (i in 1..num2) {
        result *= num1
      }
      return result
    }
  
    fun subtract(num1: Int, num2: Int): Int {
      println("Subtracting $num1 - $num2")
      return num1 - num2
    }
  }
  
  fun main() {
    println("What is your name?")
    val input = readLine()  //returns a nullable string
    //println(input)
    var letsUseCalc = Calculator(input!!)   //converts nullable string to a string
    //var letsUseCalc = Calculator("Your Name")
    println(letsUseCalc.add(5,7))
    println(letsUseCalc.subtract(5,7))
    println(letsUseCalc.multiply(5,7))
    println(letsUseCalc.divide(5,0))
    println(letsUseCalc.divide(5,7))
    println(letsUseCalc.power(2,2))
    println(letsUseCalc.power(5,7))
  }