import java.util.Scanner;
class SumCountOdd{
	public static void main(String args[]){
	  Scanner s=new Scanner(System.in);
	  System.out.print("Enter two Numbers : ");
        int i = s.nextInt();
        int n = s.nextInt();
        int sum = 0,count=0;
        
        while (i <= n) {
           if(i%2==1){
              System.out.print(i+ " ");
             sum += i;
             count++;
            }
            i++;
        }
        System.out.println();
        System.out.println("Sum of Odd numbers between 1 to " + n + " is : " + sum);
        System.out.println("Count of Odd numbers between 1 to " + n + " is : " + count);

        
	}
}


