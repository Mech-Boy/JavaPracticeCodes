import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
	System.out.println("Enter a Number :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=1, fact=1;;
	System.out.println("------------------------");
	while(i<=n){
	    fact*=i;
	   i++;
	  }
	  System.out.println("The Factorial of number "+n+" is "+fact);
	}
}
