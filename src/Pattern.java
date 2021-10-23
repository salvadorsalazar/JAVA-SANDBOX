import java.util.Scanner;

public class Pattern {
//make a pattern using for loops
    public static void main(String[] args) {
        System.out.println("hello,how many stars would you like to print");
        Scanner scan = new Scanner(System.in);
        int numStars = scan.nextInt();

        for(int i = 1; i<=numStars; i++){//rows
            for (int j=0; j<i; j++){//columns
                System.out.print("*");
            }
            System.out.println();
        }

for (int i =numStars-1; i>0;i--){
    for (int j=0; j<i; j++){//columns
        System.out.print("*");
    }
    System.out.println();
}


    }//end main
}

