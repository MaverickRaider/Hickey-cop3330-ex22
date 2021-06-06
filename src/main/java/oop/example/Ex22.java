
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        int largestNum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        if(num1 > num2){
            largestNum = num1;
        }
        else if (num2 > num1){
            largestNum = num2;
        }
        else{
            largestNum = num1;
        }

        if(largestNum < num3){
            largestNum = num3;
        }
        else{
            System.out.println("All numbers are the same.");
            System.exit(0);
        }

        System.out.println("The largest number is " + largestNum);

    }
}