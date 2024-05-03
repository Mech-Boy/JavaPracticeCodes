import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
