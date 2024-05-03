import java.util.Scanner;
class EvenAndOddDigitFromNumber{
	public static void main(String args[]){
	System.out.println("Enter a Number :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int rem=0,evenSum=0,oddSum=0;
	System.out.println("------------------------");
	while(n!=0){
	    rem=n%10;
	    if(rem%2==0){
	       System.out.println(rem+" is even digit");
	       evenSum+=rem;
	     }else{
		oddSum+=rem;
	      System.out.println(rem+" is odd digit");
	      }
	   n/=10;
	  }
	       System.out.println("The Sum of even Digits is :" + evenSum);
	 	  System.out.println("The Sum of odd Digits is :" + oddSum);

	}
}

