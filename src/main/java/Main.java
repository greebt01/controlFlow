import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the temp in Fahrenheit?");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp > 75) {
            System.out.println("It's warm out today.");
            System.out.println("Be sure to drink plenty of water, Soldiers!");
        }
        else if (temp > 60) {
            System.out.println("Beautiful day.");
        }
        else {
            System.out.println("Cold day.");
        }
    }
}