import java.util.Scanner;
public class NaturalNumbers {
    public static void main(String[] args) {
        int i =1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=s.nextInt();
        
        System.out.println("----------------------");
        while (i<=n) {
        	         System.out.print(i+ "  ");  
        	       i++;
               }
    }
}






