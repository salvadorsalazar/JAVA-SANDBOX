//small example of factorial using java
public class Factorial {
    //recursion function to find factorial of a number
    public static void main(String[] args) {

//        //5! = 5*4*3*2*1=120
//        System.out.println(factorial(5));

        int[] numbers = new int[]{1,2,3,4};
        int result = 0;
        for(int number : numbers){
            result *= number;
        }


    }//end main



    public static int factorial(int num){
        if (num == 1) {
            System.out.println("factorial("+ num+") = 1");
            return 1;
        }else{
            System.out.println("factorial("+ num+") * factorial("+(num-1)+")");
            return num * factorial(num -1);
        }


    }

}
