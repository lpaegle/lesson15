import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        //Create the algorithm which will process the sentence and return
        // the result - is this sentence a palindrome or not.

        String firstPal = "Was it a car or a cat I saw?";
        String reversed = "";
        int strLength = firstPal.length();

        for (int i = (strLength - 1); i >= 0; i--){
            reversed = reversed + firstPal.charAt(i);
        }
        //Transforms to lower cases and removes spaces and symbols (except letters and digits)
        //Checks if firstPal and reversed Strings are equal
        if (firstPal.toLowerCase().replaceAll("\\W", "").equals(reversed.toLowerCase().replaceAll("\\W", ""))){
            System.out.println(firstPal + " - is a palindrome!");
        }else{
            System.out.println("Not a palindrome. Try again!");
        }
        //Prints both transformed strings
        System.out.println(firstPal.toLowerCase().replaceAll("\\W", ""));
        System.out.println(reversed.toLowerCase().replaceAll("\\W", ""));
    }
}
