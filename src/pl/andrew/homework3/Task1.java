package pl.andrew.homework3;


import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.println("Enter three numbers: ");
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int number : numbers) {
            sum += number;
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The sum of the numbers is: " + sum);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}