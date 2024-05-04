import java.util.Scanner;
class Question8{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter your age:");
   	int a=s.nextInt();
        if(a>=18){
	 System.out.println("You are eligible to vote");
	}else{
	   System.out.println("You are NOT eligible to vote");
	}  	
   }
  }
