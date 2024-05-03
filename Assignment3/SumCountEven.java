import java.util.Scanner;
class SumCountEven{
	public static void main(String args[]){
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter two Numbers : ");
        int i = s.nextInt();
        int n = s.nextInt();
        int sum = 0,count=0;
          System.out.println("----------------------------");

        while (i <= n) {
           if(i%2==0){
              System.out.print(i+ " ");
               sum += i;
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.println("Sum of Even numbers between 1 to " + n + " is : " + sum);
        System.out.println("Count of Even numbers between 1 to " + n + " is : " + count);

        
	}
}



