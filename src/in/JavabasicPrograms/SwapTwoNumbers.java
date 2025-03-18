//This program will swap the numbers and will show multiple methods of doing so

package in.JavabasicPrograms;

import java.util.Scanner;

///will use two methods first will be with the help of third variable and without using any third vairable

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will swap the numbers :");
        System.out.print("\nEnter the two numbers: ");
/*        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int temp;
        temp = num1;
        num1 = num2;
        num2 =temp;
        System.out.println("The numbers after swapping is " + num1 + " " + num2);*/

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Before: a=" + a + ", b=" + b);

        // With third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("With temp: a=" + a + ", b=" + b);



        // Without third variable
        a = a + b; // a becomes sum
        b = a - b; // b becomes original a
        a = a - b; // a becomes original b
        System.out.println("Without temp: a=" + a + ", b=" + b);
    }
}
