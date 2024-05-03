import java.util.Scanner;
class SumEven{
	public static void main(String args[]){
	  Scanner s=new Scanner(System.in);
	  System.out.print("Enter a number : ");
        int n = s.nextInt();
        int sum = 0;
        int  i = 1;
        while (i <= n) {
           if(i%2==0){
             sum += i;
            }
            i++;
        }
        System.out.println("Sum of Even numbers between 1 to " + n + " is : " + sum);
        
	}
}
