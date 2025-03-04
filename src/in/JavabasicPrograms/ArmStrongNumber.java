package in.JavabasicPrograms;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check the armstrong number ");
        System.out.print("\nEnter the number: ");
        int num = input.nextInt();
        int c, arm=0;
        c = num;
        while(num>0){
            int remainder= num%10;
            arm= (remainder*remainder*remainder)+arm;
            num = num/10;
        }
        if(c==arm){
            System.out.println("The given number " +c+ " is " + "armstrong");

        }else{
            System.out.println("The given number "+ c+ " is "+ "not armstrong");
        }
    }
}
