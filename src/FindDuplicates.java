//java function to find duplicate letters in a string
public class FindDuplicates {

    public static void main(String[] args) {
        String sentence = "how many duplicates are there";
        System.out.println(sentence);
        //System.out.println( sentence.charAt(0));
        String characters = "";
        String duplicates = "";

            for(int i=0;i<sentence.length();i++) {
                //   System.out.println(sentence.charAt(i));
            String current = Character.toString(sentence.charAt(i));
               if(characters.contains(current)){
                   if(!duplicates.contains(current)){
                       duplicates += current+",";

                   }

             //   System.out.println(characters);
            }
                characters += current;
               // System.out.println(characters);

            }
        System.out.println(duplicates);
    }//end main
}
