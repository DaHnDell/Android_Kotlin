package com.kcanmin.kotlin_ex

fun main() {
//    println("hello world!")
//
//    var num1 = 10
//    val num2 = 15
//    val num3 = num1+ num2
//
////    변수에 값을 할당하는 시점에 값에 대한 Type 이 정의된다.
//
////    val == const , 하지만 선언할 때 무조건 값이 할당되어야만 하지는 않는다.
//
//    num1 = 20;
////    num2 = 30; 불변 값은 절대 다시 할당될 수 없습니다.
//    println("Hello World!");
//
//    println(num1);
//
//
////    num1 > num2 ? println("num1 이 더 커") : println("num1 이 더 커")
//
////    when
//    when(num1){
//        num1 -> println("value $num1");
//        10 -> println("value 10");
//        20 -> println("value 20");
//
//        else -> println("value is bjalksdjfkljq");
//
//    }
//
//    println("===============================================")
//
//    var result = when(num2){
//        num3 -> "value is 10";
//        30 -> "value is 30";
//        else -> "unknown";
//    }
//    println(result);
//
//
//    val day = "Tue"
//
//    when (day) {
//        "Mon","Tue","Wed","Thu","Fri" -> println("weekday");
//        "Sat", "Sun" -> println("weekend");
//    }
//
//
////    범위 조건
////    score = 85;
////    A, B, C
//
    var score: Int = 85;

//    when (score) {
//
//    }

//    if (score <= 100 && score >= 90) {
//        println("Score is A");
//    } else if (score < 90 && score >= 80) {
//        println("Score is B");
//    } else {
//        println("Score is C");
//    }
//
//    when (score) {
//        in 90..100 -> println("A");
//        in 80..89 -> println("B");
//        in 70..79 -> println("C");
//    }
//
//    // is
//    println(score is Int)
//    var value: Any = "Hello";
//
//    var result = when (value) {
//        is String -> "I'm String"
//        is Char -> "I'm Char"
//        is Double -> "I'm Double"
//        else -> "unkown"
//    }
//    println(result)
//
//    var num1 = 15;
//
//    when {
//        num1 % 2 == 1 -> println("odd");
//        num1 % 2 == 0 -> println("even");
//        else -> println("?")
//    }
//
//    print(getGrade(score));
//
//    for(x in  2..9){
//        println("======$x Dan=====")
//        for(y in 1..9){
//            println("$x * $y = ${x*y}");
//        }
//    }

    // list -> mutable
    // new ArrayList(Stream.of(...).toList())

    // array
    var numbers = arrayOf(1, 2, 3, 4, 5);
    println(numbers);
//    for(numbers : num){
    for(x in numbers){
        println(x);
    }
//    val numbers2 = Array(5){0}
//    println(numbers2)
//    for(x in numbers2){
//        println(x)
//    }
//
//    println(numbers2.joinToString())
//    doubleArrayOf() // 기본 자료형을 대상으로 하는 배열 생성 함수

//    println(numbers[2]);
//    println(numbers.size)

//    numbers[1] = 10;
//    numbers[3] = 20;
//
//
//    for((x, i) in numbers.withIndex()){
//        println("index = $i, val = $x");
//    }
//
//    println(numbers.sortedArray().joinToString())
//
//    println(numbers.map { i -> i*i }.toIntArray())

//    numbers.map { (i -> i + i) }.forEach(i -> println(i));

//    numbers = arrayOf(10, 2, 3, 20, 5);


//    val animal = Animal({"곰", 4});
//    val person = Person("길동이", 12);
//    person.age = 430;
//    person.name = "새똥이";

//    val student = Student(1, "Hanmin");
//    println(student); // data = 저장의 목적 , dto
//
//    obj.c++;
//    println(obj.c);
//    obj.c++;
//    println(obj.c);

    val a = fun(){ println("Hello a!") }
    a()
    val b : () -> Unit = { println("Hello b!") }
    b()

    val c : (Int) -> Int = { it * it } // 두개를 받아서 하나 반환하는 람다식.
    println(c(5));

    val d : (Int, Int) -> Int = {a,b -> a + b} // d의 타입을 앞에서 정ㅇ의하고, 뒤쪽에선 실제 할 행위를 의미한다.
    println(d(1, 3)); // TypeSafe 하기 위한 문법적 요구치

}

fun getGrade(score:Int): String =when(score){
    in 90 .. 100 -> "A"
    in 80 .. 89 -> "B"
    else -> "C"
}

class Animal (
    var name :String,
    var count : Int
)

class Person{
    var name : String = "";
    var age = 0;

    init{
    // 초기화 등록 부분
    }

    constructor(name:String, age:Int){
        this.name = name;
        this.age = age;
    }

    fun info(){
        println("name : ${name} age : ${age}");
    }
}

// data, object 클래스

// data가 앞에 붙으면 data 클래스라고 한다.
data class Student(val no:Int, val name:String){
}

object obj{
    var c = 0;
}