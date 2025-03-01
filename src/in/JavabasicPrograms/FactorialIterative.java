package in.JavabasicPrograms;

import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show the factorial of the given number in iterative way");
        System.out.print("\nEnter the number: ");
        int num = input.nextInt();
        int fact=1;
        for(int i = 1;  i <=num; i++){
            fact= fact * i;
        }
        System.out.println("The factorial of " +  num + " is " + fact);
    }
}
