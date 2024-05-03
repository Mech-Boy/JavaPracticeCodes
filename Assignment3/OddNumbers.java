import java.util.Scanner;
public class OddNumbers {
    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=s.nextInt();
        int i=1;
        System.out.println("----------------------");
        while (i<=n) {
        	        if(i%2==1){
        	           System.out.print(i+" ");
        	         }
        	       i++;
               }
    }
}








