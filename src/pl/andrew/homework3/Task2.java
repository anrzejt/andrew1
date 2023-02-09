package pl.andrew.homework3;

public class Task2 {
    public static void main(String[] args) {
        int[] origin = new int[10];
        for (int i = 0; i < origin.length; i++) {
            origin[i] = i;
            System.out.println(origin[i]);
        }
        double sum = 0;
        for (int i = 0; i < origin.length; i++) {
            sum = sum + origin[i];
        }
        System.out.println(sum / origin.length);


    }
}
