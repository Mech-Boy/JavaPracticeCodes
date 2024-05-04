import java.util.Scanner;
class Question2{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Enter Marks obtianed:");
   int a=s.nextInt();
   if(a>=90){
     System.out.println("YOU obtained A gread.");
   }else if(a>90&& a>=80){
      System.out.println("YOU obtained B gread.");
    }else if(a>80&&a>=70){
       System.out.println("YOU obtained C gread.");
    }else {
       System.out.println("YOU obtained D gread.");
    }
  }
}
