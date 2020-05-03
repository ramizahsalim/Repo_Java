package Homework;

/**
 *
 * Store your first name in a variable, and display the following:
 *     1. Display length of the first name.
 *     2. Does your name starts with "K" (Considering cases)
 *     3. First alphabet of your name
 *     4. Does your name ends with "M" (Ignoring cases)
 *
 * String myStatment = "I am a good programmer";
 * Use string methods to do following tasks:
 * 	1. Fetch the last word of the sentence
 * 	2. Display the total number of words in the myStatement.
 * 	3. replace all the 'r' characters with 'f' characters.
 *
 * Store your first name in a string variable.
 * Calculate the length of your name, without using length() method of String class.
 */

public class Homework2 {
    public static void main(String[] args) {
        String firstName = "Ramizah";

        int lengthFirstName = firstName.length();
        System.out.println(" Length of first name: " + lengthFirstName);

        boolean startsWithK = firstName.startsWith("K");
        System.out.println("Your first name starts with 'K': " + startsWithK);

        char firstLetter = firstName.charAt(0);
        System.out.println("First letter of your first name: " + firstLetter);

        String ignoreCaseFirstName = firstName.toLowerCase();
        char lastLetter = firstName.charAt(6);
        boolean lastLetterM= firstName.endsWith("m");
        System.out.println("Last letter of your name is 'm': " + lastLetterM);


        String myStatement = "I am a good programmer";

        String lastWord = myStatement.substring(myStatement.lastIndexOf(" ")+1);
        System.out.println("The last word is: " + lastWord);

        int count = 1;
        for (int i = 0; i < myStatement.length() - 1; i++) {
            if ((myStatement.charAt(i) == ' ') && (myStatement.charAt(i+1) != ' ')) {
                count++;
            }
        }
        System.out.println("Total number of words: " + count);

        String replaceRwithF = myStatement.replace("r","f");
        System.out.println("When you replace all 'r' with 'f': " + replaceRwithF);









    }
}
