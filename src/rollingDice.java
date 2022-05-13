import java.util.Random;
//roll a random number for dice 6sided
public class rollingDice {
    public static void main(String[] args) {
        System.out.println();
        Random rand = new Random();
        int x = rand.nextInt(6)+1;

        System.out.println("you rolled a " + x);
    }//end main


}
