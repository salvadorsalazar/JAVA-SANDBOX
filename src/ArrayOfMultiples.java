import java.util.Arrays;

public class ArrayOfMultiples {
               
    
            public static int[] multiArray(int num, int length) {
                    int [] arr = new int[length];
                    for (int i =0;i<length;i++){
                        arr[i] = num *(i+1);
                    }
                    return arr;
                }



    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiArray(7, 5)));
        // System.out.println(Arrays.toString(multiArray(12, 10)));

        // System.out.println(Arrays.toString(multiArray(17, 6)));

    }

}

//
//    Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
//
//        Examples
//        arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
//
//        arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
//
//        arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
//        Notes
//        Notice that num is also included in the returned array.