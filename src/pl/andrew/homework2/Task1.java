package pl.andrew.homework2;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        int choice;
        double amount;
        double euro = 0, zl;
        Scanner sc = new Scanner(System.in);
        System.out.println("Options:");
        System.out.println("Enter 1: euro");
        System.out.println("Enter 2: zl");
        System.out.println("\nChoose your option");
        choice = sc.nextInt();
        System.out.println("Yor number is: " + choice);
        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();
        if (choice == 1) {
            System.out.println("Your amount is:" + amount);
            euro = amount * 4.74;
            System.out.println(amount + " Euro = " + euro + " Zl ");
        } else if (choice == 2) {
            System.out.println("Your amount is:" + amount);
            zl = amount * 0.21;
            System.out.println(amount + " Zl = " + zl + " Euro ");
        }else{
            System.out.println("not support choise " + choice);
        }


    }
}


