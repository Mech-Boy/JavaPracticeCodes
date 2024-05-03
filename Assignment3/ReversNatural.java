import java.util.Scanner;
public class ReversNatural {
    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=s.nextInt();
        
        System.out.println("----------------------");
        while (n>0) {
        	         System.out.print(n+ "  ");  
        	       n--;
               }
    }
}







