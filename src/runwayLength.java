import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * @author Natasya Virgichalia.
 * Date: 09/03/2017.
 * CSC 201.
 * Professor Tanes Kanchanawanchai.
 * Assignment 2.
 * Problem 2.12.
 * Physics: finding runway length.
 * This program calculates the minimum runway length needed for an airplane to take-off
 * with the speed and the acceleration input by the user.
 */
public class runwayLength {
    public static void main(String[]args) {
        double speed, acc, length;
        System.out.println("This program will calculate the runway length");
        System.out.println("Enter the speed and acceleration");
        Scanner keyboard = new Scanner(System.in);

        //get speed
        speed = keyboard.nextDouble();
        //get acceleration
        acc = keyboard.nextDouble();
        //call calLength method
        length = calLength(speed, acc);

        DecimalFormat lengthFormat = new DecimalFormat("#.000");
        System.out.println("The minimum runway length for this airplane is " + lengthFormat.format(length));
        keyboard.close();
    }
    /**
     * This method calculates the length from the speed and acceleration given
     * @param speed
     * @param acceleration
     * @return length
     */
    public static double calLength(double speed, double acceleration) {
        double result;
        result = (speed*speed)/(2*acceleration);
        return result;
    }
}
