import java.util.Scanner;
class Question7{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter the Nubmber:");
   	int a=s.nextInt();
        if(a%2==0&&a%3==0){
	 System.out.println("The Number is divisible by both 2 and 3");
	}else{
	   System.out.println("The Number is NOT divisible by both 2 and 3");
	}  	
   }
  }
