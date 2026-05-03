object assgn1_practice {
  def main(args:Array[String]):Unit= {
//    Section 1: Variables (Basics)
//    1. Create variables to store:
//      o Your name
//    o Your age
//    o Your salary

      var name = "Jhon"
      var age =28
      var salary = 50000
//    2. Swap two numbers without using a third variable.
//    option 1. using bitwise operator
      var x = 30
      var y = 20
      x = x^y
    println(x)
       y =y^x
    println(y)
        x=y^x
    println(x)
      println(s"value of x: $x, value of y : $y")
//    option2 using tuple
    var a = 40
    var b =90
//    (a,b) = (b,a) //for scala 3 it is perfect  but for scala 2 it is not supported
//    println(s"value of a: $a, value of b : $b")
//    3. Assign multiple values to multiple variables in a single line.
      var (name2, age2, salary2 ) = ("joy", 7, 3000)
      println(name2, age2,salary2)
//    4. Take a number and print its datatype.
      println(name2.getClass) //this will provide the which  type it belongs
      println(age2.isInstanceOf[Int]) //it verifys, whether it type of given datatype or not
      println(age2.isInstanceOf[Float])
      val num = 23
      val first_name = "kiran"
      println(num.getClass)
      println(num.isInstanceOf[Float])
      println(first_name.isInstanceOf[String])
      println(first_name.isInstanceOf[Int])
//    5. Convert a string "100" into an integer and perform addition with 50.
      var number = "100"
      var number2 =number.toInt
      println(number2+ 50 )

//    // another way
     var num2 = "123"
    println(num2.toInt + 7)

    val phone_number =8765432
    println(phone_number.toString + "000")

//    Section 2: Arithmetic Operators
//      6. Take two numbers and perform:
//    o Addition
//    o Subtraction
//    o Multiplication
//    o Division

      var nums =10
      var nums2 = 9

//    addition
    var sum = nums + nums2
    var diff = nums - nums2
    var mul = nums * nums2
    var div = nums / nums2

    println(sum, diff, mul, div)

//    7. Find the remainder when a number is divided by 7.
    println(nums2%7)
//    8. Calculate the square and cube of a number.
    var num4 = 3
    println(math.pow(num4,2)) //always gives output in double
    println(math.pow(num4,3))
//    // so if we want in int then
    println("------------")
    println(math.pow(num4,2).toInt)
    println(math.pow(num4,3).toInt)
//    9. Given total marks and number of subjects, calculate average.
//    10. Calculate simple interest:
//    · Formula: SI = (P × R × T) / 100
//
//    Section 3: Comparison Operators
//      11. Check if a number is greater than 100.
     //num is 23 already above defined
       println(num >100)
//    12. Compare two numbers and print which one is bigger.
        if (nums > nums2) {
          //nums =10 , nums2 =9
            println(s"nums is greater = $nums")
        }
        else{
          println(s"nums2 is greater = $nums2")
        }
    //    13. Check if a number is equal to 50.
          println(nums == 50)
//    14. Check if a number is not equal to 0.
          println(nums2 != 50)

//    Section 4: Logical Operators (Important)
//    15. Check if a number is between 10 and 50.
     if(num > 10 && num<50){
       println(s"num is between 10 and 50 ")
     }
//    16. Check if a person is eligible to vote:
//    · Age ≥ 18
      if(age>=18){
        println(s"age = $age, person is eligible to vote")
      }
      else {
        println(s"age = $age, person is not eligible to vote")
      }
//    17. Check if a number is divisible by both 3 and 5.
        if((nums %3 ==0) && (nums%5 ==0)){
            println(s"$nums is divisible by 3 and 5")
        }
        else {
          println(s"$nums  not  divisible by 3 and 5")
        }
//    18. Check if a student passed:
//    · Marks ≥ 35 in all subjects
      var maths =40
      var english =80
    var hindi = 67
    var sst = 78


//    19. Check if a number is positive AND even.
      if((nums>=0) && (nums%2 ==0)){
        println(s"$nums is positive and even")
      }
//    20. Check if a user can login:
       var Username = "admin"
     var Password = "1234"
        if (Username =="admin" && Password =="1234"){
          println(s"$Username can login")
        }

  }
}
