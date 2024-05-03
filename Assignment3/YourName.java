import java.util.Scanner;
class YourName{
	public static void main(String args[]){
	  System.out.println("Enter Your Name : ");
	  Scanner s=new Scanner(System.in);
	  String name=s.nextLine();
	  int i=0;
	  System.out.println("----------------------");
	  while(i<5){
	   System.out.println(name);
	   i++;
	   }
	}
}