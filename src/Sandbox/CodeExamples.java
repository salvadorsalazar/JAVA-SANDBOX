package Sandbox;

public class CodeExamples {
//Swap the values of two numbers for e.g a=4 , b=5 after swapping a = 5 , b=4
public static void swapMethod1(int a , int b) {
    System.out.println("before swapping " + a + "," + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("after swapping " + a + "," + b);
    }

    public static void swapMethod2(int a , int b){
        System.out.println("before swapping " + a + "," + b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("after swapping " + a + "," + b);
    }

    //convert the temperature from fahrenheit to celsius degree
    public static void findCelsius(double f){
    double c = ((f - 32) * 5)/9;
        System.out.println("F = " + f+ " to C = "+ c);
    }

    public static void findFarenheit(double c){
    double f = ((c * 9) / 5)* 32;
        System.out.println(" c = " + c + "to f = " + f);

    }

    //find the grreatest common divisor and the least common multipe for the given two positive numbers: gcd(12,20 is 4; lcm(12,20) is 60.

    public static int findLCM(int num1, int num2, int gcd){
    return (num1 * num2) / gcd;
    }
    public static int findGCD(int num1, int num2){
    int remainder = 0;
        do{
            remainder = num1 % num2;
            num1 = num2;
            num2 =  remainder;
        }while (num2!=0);
        return num1;
    }


//create a simple calculator that takes two numbers as input and performd a;; basic arithmetic operations on it

public static void basicMath(int num1, int num2){
    System.out.println("add: "+ (num1+num2));
    System.out.println("subtract: "+(num1-num2));
    System.out.println("divide:" + (num1/num2));
    System.out.println("multiply: "+(num1*num2));

}

//exceptions




























}
