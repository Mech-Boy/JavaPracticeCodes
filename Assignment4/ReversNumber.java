import java.util.Scanner;
class ReversNumber{
	public static void main(String args[]){
	System.out.println("Enter a Number :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int j=n;
	int rem=0,sum=0;
	System.out.println("------------------------");
	while(n!=0){
	    rem=n%10;
	    rev=rev*10+rem;
	    n/=10;
	  }
	       System.out.println("The revers number is  :"+ rev);
	 	 

	}
}




