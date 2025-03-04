package in.JavabasicPrograms;

import java.util.Scanner;

public class SwapTwoNumbersAlternateWay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will swap the two given numbers");
        System.out.print("\nEnter the first number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter the second number: ");
        int num2 = input.nextInt();
        System.out.println("The numbers before swapping is "+num1 + " " + num2);

        //logic
        num2 = num1+num2-(num1=num2);
        System.out.println("The numbers after swapping is "+num1 + " " + num2);
    }
}
