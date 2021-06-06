/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jamar Jackson
 */

package base;

import java.util.Scanner;

/*
Exercise 9 - Paint Calculator

        Sometimes you have to round up to the next number rather than follow standard rounding rules.

        Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.
        Example Output

        You will need to purchase 2 gallons of paint to cover 360 square feet.

        Remember, you can’t buy a partial gallon of paint. You must
        round up to the next whole gallon.
        Constraints

        Use a constant to hold the conversion rate.
        Ensure that you round up to the next whole number.

        Challenges

        Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
        Implement support for a round room.
        Implement support for an L-shaped room.
        Implement a mobile version of this app so it can be used at the hardware store.
*/
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int length = myApp.readLength();
        int width = myApp.readWidth();
        int f2 = myApp.squareFeet(length, width);
        final int convert = Math.round((int) Math.ceil((double)f2 / 350));
        int galNeed = Math.round(convert);
        String outputString = myApp.generateOutputString(length, width, f2, galNeed);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public int readLength() {
        System.out.println("What is the length of the room in feet? ");
        return in.nextInt();
    }

    public int readWidth() {
        System.out.println("What is the width of the room in feet? ");
        return in.nextInt();
    }

    public int squareFeet(int length, int width) {
        return length * width;
    }

    public String generateOutputString(int length, int width, int f2, int galNeed) {
        return "You entered dimensions of " + length + " feet by " + width + " feet.\n" +
                "Your ceiling would be " + f2 + " square feet.\n" +
                "You will need to purchase " + galNeed + " gallons of paint to cover " + f2 + " square feet.";
    }
}
