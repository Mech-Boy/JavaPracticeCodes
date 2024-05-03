import java.util.Scanner;
class Table{
	public static void main(String args[]){
	System.out.println("Enter a Number :");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int i=1;
	System.out.println("------------------------");
	while(i<=n){
	   System.out.println(n+" X "+i+" : "+(n*i));
	   i++;
	  }
	}
}