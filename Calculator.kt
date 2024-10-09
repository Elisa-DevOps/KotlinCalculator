//Project: Kotlin Calculator
//Purpose: Basic Calculator - add, subtract, multiply, divide, power
//Author: Elisa Aldridge
class Calculator (val name: String) {

    init {
      println("$name owns this calculator.\n")
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
  
  fun userExit() {
    println("You typed exit.")
  }

  fun main() {
    println("What is your name?")
    val input = readLine()  //returns a nullable string
    //println(input)
    var letsUseCalc = Calculator(input!!)   //converts nullable string to a string
    //var letsUseCalc = Calculator("Your Name")

    //allow user to exit at any point
    println("**To Exit at anytime type 'exit' to quit. Press Enter to continue calculations.**\n")
    var inputLoop = readLine()
    if (inputLoop == "exit") {
      userExit()
    }

    while (inputLoop != "exit") {
      println("Let's add 5 + 7.\n")
      println(letsUseCalc.add(5,7))
      println("Once you have reviewed the answer, press Enter to continue")
      inputLoop = readLine()
      if (inputLoop == "exit") {
        userExit()
        break
      }

      println("Let's Subtract 5 - 7.\n")
      println(letsUseCalc.subtract(5,7))
      println("Once you have reviewed the answer, press Enter to continue")
      inputLoop = readLine()
      if (inputLoop == "exit") {
        userExit()
        break
      }

      println("Let's multiply 5 * 7.\n")
      println(letsUseCalc.multiply(5,7))
      println("Once you have reviewed the answer, press Enter to continue")
      inputLoop = readLine()
      if (inputLoop == "exit") {
        userExit()
        break
      }

      println("Let's divide 5 / 0.\n")
      println(letsUseCalc.divide(5,0))
      println("Once you have reviewed the answer, press Enter to continue")
      inputLoop = readLine()
      if (inputLoop == "exit") {
        userExit()
        break
      }

      println("Let's divide 5 / 7.\n")
      println(letsUseCalc.divide(5,7))
      println("Once you have reviewed the answer, press Enter to continue")
      inputLoop = readLine()
      if (inputLoop == "exit") {
        userExit()
        break
      }

      println("Let's find the power of 2 ^ 2.\n")
      println(letsUseCalc.power(2,2))
      println("Once you have reviewed the answer, press Enter to continue")
      inputLoop = readLine()
      if (inputLoop == "exit") {
        userExit()
        break
      }

      println("Let's find the power of 5 ^ 7.\n")
      println(letsUseCalc.power(5,7))
      println("Once you have reviewed the answer, press Enter to Exit")
      inputLoop = readLine()
      if (inputLoop == "exit") {
        userExit()
        break
      }
    }

    println("Goodbye.")
  }