import java.util.Scanner;
class MinOfNDigit{
	public static void main(String args[]){
	System.out.println("Enter a Number :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int j=n;
	int rem=0,rev=10;
	System.out.println("------------------------");
	while(n!=0){
	    rem=n%10;
	   if(rem<rev){
	     rev=rem;
	     }
	    n/=10;
	  }
	  System.out.println("The Minimum Digit of give number is :"+rev);
		 	 

	}
}







