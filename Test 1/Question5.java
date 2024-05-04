import java.util.Scanner;
class Question5{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter a Nubmer");
 
   	int a=s.nextInt();
 	int n=0;
    System.out.println("The even numbers from give numbers are as follows:");
        while(a!=0){
	   n=a%10;
	  if(n%2==0){
		System.out.print(n+" ");
            }
	  a/=10;
	}
    	
   }
  }
