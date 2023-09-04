public class Main {
    public static void main(String[] args) {
        int n = 8; // Change this value to the desired range of odd numbers

        System.out.println("Odd numbers between 1 and " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
