package in.JavabasicPrograms;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
/*        int a = 5;
        int b =9;
        int sum = a + b;
        System.out.println("The sum of the given numbers are :" + sum);*/

        Scanner input = new Scanner(System.in);
        System.out.println("This program will show the addition of the two number");
        System.out.print("\nEnter the first number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter the second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the given numbers are :" + sum);

    }
}
