public class differenceMaxMin {
    public static int differenceMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1 ; i < arr.length ; i++) {
            if (arr[i] > min) {
                min = arr[i];
            } else if (arr[i] < max) {
                max = arr[i];
            }
        }

        return min-max;
    }

    public static void main(String[] args) {
        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21})) ;
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));
        }
   }



//    Create a function that takes an array and returns the difference between the biggest and smallest numbers.

//    differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
//// Smallest number is -50, biggest is 32.
//
//        differenceMaxMin([44, 32, 86, 19]) ➞ 67
//// Smallest number is 19, biggest is 86.