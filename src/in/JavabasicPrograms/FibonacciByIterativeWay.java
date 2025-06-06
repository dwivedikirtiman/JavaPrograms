//This program shows the Fibonacci series up to the given number of terms.

package in.JavabasicPrograms;

import java.util.Scanner;

public class FibonacciByIterativeWay {
    public static void main(String[] args) {
        System.out.println("This program shows the Fibonacci series up to the given number of terms.");
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number of terms for the Fibonacci series: ");
        int term = input.nextInt();

        int a = 0, b = 1;
        for (int i = 1; i <= term; i++) {
            System.out.print(a+ " ");  // Print current term
            int c = a + b;        // Calculate next term
            a = b;                // Shift a to b
            b = c;                // Shift b to next term
        }

        input.close();  
    }
}
