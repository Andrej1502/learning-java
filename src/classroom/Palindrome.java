package classroom;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner  myScanner = new Scanner(System.in);
        System.out.println("Please enter a word ");
        String word = myScanner.nextLine();

        //Andrej
        //A = [0]
        //n = [1]
        // andrej.length = will return character count;

        String iterated = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            iterated = iterated + word.charAt(i);

        }
        if (word.equals(iterated)) {
            System.out.println("This word is palindrome");
        } else {
            System.out.println("Is not a palindrome");
        }
    }
}
