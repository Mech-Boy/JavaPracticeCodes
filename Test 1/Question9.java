import java.util.Scanner;
class Question9{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter a Nubmer"); 
   	int a=s.nextInt();
        int b=a;
 	int n=0,num=0;
        while(a!=0){
	   n=a%10;
	   num=num*10+n;
	  a/=10;
	}
        if(num==b){
	System.out.println("The Number is Palindrom");
	}else{
	System.out.println("The Number is NOT Palindrom");
	}
    	
   
  }
}
