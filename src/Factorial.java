
public class Factorial {
    //recursion function to find factorial of a number
    public static void main(String[] args) {

        //5! = 5*4*3*2*1=120
        System.out.println(factorial(5));




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
