/*
 * This is a program that calculates the maple logs in java.
 *
 *  @author Venika Sem
 *  @version 1.0
 *   @since Feb-2024
 */

import java.util.Scanner;

public class MapleLogs {

    public static void main(String[] args) {
        final int truckLimit = 1100;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the logs in meters ( 0.25, 0.5, 1): ");
        double lengthOfLog = input.nextDouble();
        input.close();
        System.out.println("\nEnter the length of the logs: " + lengthOfLog);

        try {
            if (Double.isNaN(lengthOfLog)) {
                throw new Exception("Invalid input.");
            }
            double massLogs = 20 * lengthOfLog;

            if (massLogs == 0) {
                throw new Exception("Mass of logs cannot be zero.");
            }

            double numberOfLogs = truckLimit / massLogs;

            System.out.println("The number of logs is " + numberOfLogs);
        } catch (Exception error) {
            System.err.println("Error: " + error.getMessage());
        }

        System.out.println("\nDone.");
    }
}
