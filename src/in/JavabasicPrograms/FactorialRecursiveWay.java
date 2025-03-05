//This program will show the factorial of the given number in a recursive way

package in.JavabasicPrograms;

import java.util.Scanner;

public class FactorialRecursiveWay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show the factorial of the given number in recursive way"); // Fixed typo
        System.out.print("\nEnter your number: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("invalid number! please enter a positive integer number");
            input.close(); // Close Scanner before exiting
            return;
        } else if (num == 0 || num == 1) {
            System.out.println("The factorial of " + num + " is " + 1);
        } else {
            long fact = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is " + fact);
        }

        input.close(); // Close Scanner at the end
    }

    // Added return type (long) and base case
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) { // Base case to stop recursion
            return 1;
        }
        return num * calculateFactorial(num - 1); // Recursive call with correct parameter
    }
}
