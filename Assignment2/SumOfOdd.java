import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}
