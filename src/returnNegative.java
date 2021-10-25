public class returnNegative {

    public static int returnNeg(int n) {
        return -Math.abs(n);

    }


    public static void main(String[] args) {
        System.out.println(returnNeg(65));
        System.out.println(returnNeg(-65));
        System.out.println(returnNeg(605));

    }
}

//    Create a function that takes a number as an argument and returns negative of that number. Return negative numbers without any change.
//
//        Examples
//        returnNegative(4) ➞ -4
//
//        returnNegative(5) ➞ -5
//
//        returnNegative(-54) ➞ -54
//
//        returnNegative(0) ➞ 0