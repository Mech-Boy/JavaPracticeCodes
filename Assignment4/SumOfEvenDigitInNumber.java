import java.util.Scanner;
class SumOfEvenDigitInNumber{
	public static void main(String args[]){
	System.out.println("Enter a Number :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int j=n;
	int rem=0,sum=0;
	System.out.println("------------------------");
	while(n!=0){
	    rem=n%10;
	   if(rem%2==0){
	     sum+=rem;
	    }
	    n/=10;
	  }
	       System.out.println("The Sum of Even Digits in number :" +j+" is :"+sum);
	 	 

	}
}



