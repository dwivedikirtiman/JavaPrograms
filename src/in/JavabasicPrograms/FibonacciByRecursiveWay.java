//This program shows the Fibonacci series up to the given number of terms.

package in.JavabasicPrograms;
import java.util.Scanner;
public class FibonacciByRecursiveWay {
        public static void main(String[] args) {
            System.out.println("This program shows the Fibonacci series up to the given number of terms.");
            Scanner input = new Scanner(System.in);
            System.out.print("\nEnter the number of terms for the Fibonacci series: ");
            int term = input.nextInt();

            System.out.println("Fibonacci series:");
            for (int i = 0; i < term; i++) {
                System.out.print(fibonacci(i)+ " ");
            }

            input.close();
        }

        // Recursive function to calculate Fibonacci number
        public static int fibonacci(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
}


