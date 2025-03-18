//This program will check the largest numbers from the given three numbers

package in.JavabasicPrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check the largest numbers from the given three numbers");
        System.out.print("\nEnter first number: ");
        int num1 = input.nextInt();
        System.out.print("\nEnter second number: ");
        int num2 = input.nextInt();
        System.out.print("\nEnter third number: ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is the largest number");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the largest number");
        }
        else{
            System.out.println(num3 + " is the largest number");
        }
    }
}
