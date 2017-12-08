/** Arithmancy Calculator
 *  @author Vivian Tsai
 *  Last updated 08 Dec 2017
 */

import java.io.*;

public class Arithmancy {
    /** Main method. */
    public static void main(String [] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        // read in and save name
        System.out.print("Enter name: ");
        String input = kb.readLine().replaceAll("[^A-Za-z]|\\s+","").toUpperCase();

        // initialize arrays
        int [] numbers = new int [input.length()];
        boolean [] isVowel = new boolean [input.length()];

        // store number equivalents, isVowel for all letters in name
        String currLetter;
        int total = 0, vowelTotal = 0, consonantTotal = 0, currNum;
        for (int i = 0; i < input.length(); i++) {
            currLetter = input.substring(i,i+1);
            currNum = lettToNum(currLetter);
            // TODO: handle 'Y' vowel/consonant cases (right now, assume consonant)
            if (currLetter.equals("A") || currLetter.equals("E") || currLetter.equals("I")
                    || currLetter.equals("O") || currLetter.equals("U")) {
                isVowel[i] = true;
                vowelTotal += currNum;
            } else {
                consonantTotal += currNum;
            }
            numbers[i] = currNum;
            total += currNum;
        }
        System.out.println();
        // find character num
        System.out.println("Character: " + reduce(total));
        // find heart num
        System.out.println("Heart: " + reduce(vowelTotal));
        // find social num
        System.out.println("Social: " + reduce(consonantTotal));
        System.out.println();
    }
    /** Reduces number. */
    public static int reduce(int num) {
        while (num >= 10) {
            int sum = 0; 
            while (num >= 10) {
                sum += (num % 10);
                num /= 10;
            }
            num += sum;
        }
        return num;
    }
    /** Converts letter to its arithmancy number. */
    public static int lettToNum(String letter) {
        return ((Integer.parseInt(letter,36)-10) % 9) + 1;
    } 
}
