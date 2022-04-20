public class Main {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's warm out today.");
            System.out.println("Be sure to drink plenty of water, Soldiers!");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day.");
        } else {
            System.out.println("Cold day.");
        }
    }
}