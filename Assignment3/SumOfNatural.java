import java.util.Scanner;
class SumOfNatural{
	public static void main(String args[]){
	  Scanner s=new Scanner(System.in);
	  System.out.print("Enter a number : ");
        int n = s.nextInt();
        int sum = 0;
        int  i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of natural numbers between 1 to " + n + " is : " + sum);
        
	}
}