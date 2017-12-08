/** Quote Generator
 *  @author Vivian Tsai
 *  Last updated 08 Dec 2017
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class QuoteGenerator {
    ArrayList<String> quotes; // all quotes

    /** Constructor. */
    public QuoteGenerator(String file) throws IOException {
         quotes = new ArrayList<String>();
         process(file); // store quotes
    }
    /** Stores quotes from input txt. */
    private void process(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        // read in each subsequent row as one item
        while ((line = br.readLine()) != null) {
            quotes.add(line); // store new item in array
        }
        br.close();
    }
    /** Returns random quote from array. */
    public String generate() {
        return quotes.get(new Random().nextInt(quotes.size()));
    }
    /** Main method. */
    public static void main(String [] args) throws IOException {
        // randomly pick one of the seven Harry Potter books
        int bookNum = new Random().nextInt(7) + 1;
        System.out.println("\n"
            + new QuoteGenerator("hp" + bookNum + ".txt").generate() + "\n");
    }
}
