package in.JavabasicPrograms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will print the multiplication table of the given number");
        System.out.print("\nEnter the number: ");
        int num = input.nextInt();
        System.out.println("Multiplication table of "+ num + " is");
        int i = 1;
        while(i<=10){
            System.out.println(num + " X "+ i + " = "+ (num*i));
           // num = num * i;
            i++;

        }

       /* for(int i = 1; i<=10; i++){
            System.out.println(num + " X "+ i + " = "+ (num*i));
        }*/
        input.close();

    }
}
