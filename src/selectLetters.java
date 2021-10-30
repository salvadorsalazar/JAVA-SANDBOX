public class selectLetters {

//    working on
    public static String selectLetters(String s1, String s2) {
        String total = "";
        int length = Math.min(s1.length(), s2.length());
        for (int i = 0; i < length; i++) {
            if (s2.charAt(i) >= 65 && s2.charAt(i) <= 90) {
                total += s1.charAt(i);
            }
        }
        for (int i = 0; i < length; i++) {
            if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90) {
                total += s2.charAt(i);
            }
        }
        return total;
    }
}
