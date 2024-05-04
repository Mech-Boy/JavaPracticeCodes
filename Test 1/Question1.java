import java.util.Scanner;
class Question1{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter Two Numbers:");
    double a=s.nextDouble();
    double b= s.nextDouble();
    System.out.println("Enter the opration you want to perform ( + - * / ):");
    char ch=s.next().charAt(0);
    switch(ch){

     case '+':System.out.println("The sum is :" +(a+b));
              break;
     case '-':System.out.println("The sub is :" +(a-b));
              break;
     case '*':System.out.println("The multi is :" +(a*b));
              break;
     case '/':System.out.println("The div is :" +(a/b));
              break;
     case '%':System.out.println("The mod is :" +(a%b));
              break;
     default:System.out.println("Invalid Input!" );
             break;
    };
  }

}
