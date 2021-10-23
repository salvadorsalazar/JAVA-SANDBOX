public class edabitTest1 {
    public static void arrayOfMultiples(int num, int length) {
        //Create a function that takes two numbers as arguments
        //(num, length) and returns an array of multiples
        //of num until the array length reaches length.
		
		num=7;
		length = 5;

			int[] numArray = new int[length];
			for (int i = 0; i < length; i++) {
					numArray[i] = (num * (i+1));
			}
        System.out.println(numArray);
			//return numArray;
    }


    public static void main(String[] args) {
arrayOfMultiples(7,5);



    }

    }
