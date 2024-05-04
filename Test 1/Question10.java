import java.util.Scanner;
class Question10{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter three numbers:"); 
   	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
       
 	int max=a;
	 if(b>max){
  	max=b;
	}
	 if(c>max){
  	max=c;
	}
	System.out.println("The maximum of three number is :"+max);
    	
   
  }
}
