import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countWords {

    public static int countWords(String s) {

        return s.split(" ").length;

    }

//PRINT AN ARRARY
    public static List PrintArray(int number)
    {
        List array = new ArrayList<>();

        for(int count = 1; count <= number;count++)
        {
            array.add(count);
        }

        return array;
    }

//
//    public String fizzString(String str){
//        if(str.startsWith("f"))
//            return "Fizz";
//        if(str.endsWith("b")) return "Buzz";
//
//        return str;
//    }


    public static void main(String[] args) {
        System.out.println(countWords("hello world"));
        System.out.println(countWords("This is the end of the sentence"));


        System.out.println((Arrays.asList(1)));
        System.out.println((Arrays.asList(1,5,10)));


    }

}
