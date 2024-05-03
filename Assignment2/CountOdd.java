import java.util.Scanner;

public class CountOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int count = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                count++;
            }
            i++;
        }
        System.out.println("Count of odd numbers: " + count);
    }
}
