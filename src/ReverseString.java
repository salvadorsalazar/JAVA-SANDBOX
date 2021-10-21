import java.util.Scanner;
//program to revers a word
public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or Sentence to reverse");
        //scanner =
        String word = scanner.nextLine();
        System.out.println(reverse(word));

        //--to pass string into revers method------
        //String r = reverse("dog");
        //System.out.println(r);

    }


    public static String reverse(String s){

        char[] letters = new char[s.length()];

        int letterIndex = 0;
        for(int i=s.length()-1;i>=0;i--){
//            System.out.println(s.charAt(i));
        letters[letterIndex] = s.charAt(i);
        letterIndex++;
        }
        String reverse ="";
        for (int i=0;i<s.length();i++){
            reverse = reverse + letters[i];
        }
        return reverse;
    }

}
