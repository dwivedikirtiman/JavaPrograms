//This program will add the digits of the given number

package in.JavabasicPrograms;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will add the digits of the given number");
        System.out.print("\nEnter the number: ");
        int num = input.nextInt();
        int sum=0;
        for (; num > 0; num /= 10) {
            sum += num % 10;  // Extract last digit and add to sum
        }
        /*while(num>0){
            int remainder=num%10;
            sum = sum+remainder;
            num= num/10;
        }*/
        System.out.println("The sum of the digits is "+ sum);
    }
}
