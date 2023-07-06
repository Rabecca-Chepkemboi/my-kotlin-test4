import kotlin.math.sqrt

fun main() {
    var result = solve("JaNe")
    println(result.lowercase())

    fullname("Ada")

    var ans = division(56,7)
    println(ans)

    var results = number(45, 56)
    println(results)

    var answer = sum(23, 45, 24, 12)
    println(answer)

    fact()

    var answers = square(12.7)
    println(answers)

    aging(12)
    aging(20)
    aging(70)

    number()

    digits(12)
    digits(23)




    var result1 = firstChar("Issabella", "Clara")
    println(result1)

    var result2 = nums(arrayOf(23, 67, 63, 98, 3, 6))
    println(result2)

    takeString("my name is Ambrose")

    var result3 = details(arrayOf("doctor", "teacher", "driver"))
    println(result3)

   val calc = Calculator()
    calc.addition(32, 34)
    calc.multiply(12, 56)
    calc.subtract(78, 43)
    calc.divide(20.6, 6.1)

    vowels("Rabecca Chepkemboi")

}

fun solve(x: String):String{
    return x
}

fun fullname(name: String){
    var names = ("Hello $name")
    println(names)
}

fun division(num1: Int, num2: Int): Int{
//    var num1 = 12
//    var num2 = 4
//    println(num1%num2)
    return num1 %num2
}

fun number(num1: Int, num2: Int):Int{
    return num1/num2
}

fun sum(num1: Int, num2:Int, num3:Int, num4:Int):Int{
    return num1 + num2 + num3 + num4
}

fun fact(){
    var fact = "I am amaizing"
    println(fact)

}

fun square(num1: Double): Double{
    return sqrt(num1)
}

//Write a program in Kotlin that asks the user to enter
// their age and prints a message based on their age. If
// the age is less than 18, print "You are not old enough to vote".
// If the age is between 18 and 65, print "You are eligible to vote".
// If the age is greater than 65, print "You are a senior citizen"

fun aging(age:Int){

    if (age < 18){
        println("you are not old enough to vote")
    }
    else if(age<=65){
        println("you are eligible enough to vote")
    }
    else if(age>65){
        println("you are a senior citizen")
    }
}

//Write a program in Kotlin that prints the numbers from 1 to 10 using a for loop
fun number(){
    for (x in 1..10 )
        println(x)
}

fun digits(num: Int){

    if (num %2 ==0){
        println("it's even")
    }
    else{
        println("it's odd")
    }
}




              //KOTLIN ASSESMENT1 CORRECTION

//Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.

fun firstChar(string1: String, string2: String):Char{
    if (string1.length > string2.length){
        return string1[0]
    }
//    else if (string2.length > string1.length){
//        return  string2[0]
//    }
    else{
        return  string1[0]
    }
}


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements

fun nums(num:Array<Int>):Triple<Int, Int, Double>{
    var num1 = num.max()
    var nun2 = num.min()
    var num3 = num.average()
    return Triple(num1, nun2, num3)

    //or

//data class Stats(var min: Int, var max: Int, var avg: Double)
//    fun arrayStats(numbers: Array<Int>):Stats{
//        val min = numbers.min()
//        val max = numbers.max()
//        val avg = numbers.average()
//
//        val stats = Stats(min, max, avg)
//        return stats
//    }

}


//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.

fun takeString(words: String){
    println(words.split(" "))
}


//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.

fun details(det:Array<String>):String{
    return det.joinToString("")
}


//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

class  Calculator{
    fun addition(num1: Int, num2: Int): Int{
        return num1+num2
    }

    fun subtract(num1: Int, num2: Int): Int{
        return num1-num2
    }

    fun multiply(num1: Int, num2: Int): Int{
        return num1*num2
    }

    fun divide(num1: Double, num2: Double): Double{
        return num1/num2
    }

}


//Write a Kotlin program to count the number of vowels in a given string
fun vowels(name: String) {
    var y = 0
    for (x in name){
        when (x) {
            'a' -> y++
            'e' -> y++
            'i' -> y++
            'o' -> y++
            'u' -> y++
        }
    }
    println(y)
}
