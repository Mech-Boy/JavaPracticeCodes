import java.util.Scanner;
class MultipleInputs{
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=-1;
	int cnt=0,sum=0;
	System.out.println("------------------------");
	while(n!=0){
	   System.out.println("Enter a Number (0 for EXIT)");
	   n=s.nextInt();
	    sum+=n;
	  }
	       System.out.println("The Sum of all inputs :"+sum);
	 	 
	}
}



