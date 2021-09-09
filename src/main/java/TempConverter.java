/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Frances
 */
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        String name = sc.nextLine();
        int temp=0,res=0;
        if(name.toLowerCase().equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = sc.nextInt();
            res = (temp - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is "+res+".");
        }
        else if(name.toLowerCase().equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            temp = sc.nextInt();
            res = (temp * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is "+res+".");
        }
        else{
            System.out.println("Wrong Input!");
        }
    }
}
