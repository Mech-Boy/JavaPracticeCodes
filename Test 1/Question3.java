import java.util.Scanner;
class Question3{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter a Nubmer"); 
   	int a=s.nextInt();
 	int n=0,max=-1;
        while(a!=0){
	   n=a%10;
	  if(n>max){
		max=n;
            }
	  a/=10;
	}
    	System.out.println("The max digit of given Number is : "+ max);
   
  }
}
