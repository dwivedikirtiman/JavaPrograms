package in.JavabasicPrograms;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check the even or odd number");
        System.out.print("\nEnter your number: ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
