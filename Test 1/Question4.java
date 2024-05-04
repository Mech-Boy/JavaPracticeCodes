import java.util.Scanner;
class Question4{
  public static void main (String args[]){
    Scanner s =new Scanner(System.in);
    System.out.println("Is Driver Married (true/false)"); 
    boolean m=s.nextBoolean(),male,female;
    int age;
   	 if(m){
         System.out.println("The Driver will get his insurance");
   	 }else{
	 System.out.println("Is driver Male(true/false)");
          male=s.nextBoolean();
          if(male){
           System.out.println("Enter the age of male Driver");
	   age=s.nextInt();
              if(age>30){
			 System.out.println("The Driver will get his insurance");
			}else{
			 System.out.println("The Driver will NOT get his insurance");
			}
	        }else{
		   System.out.println("Enter the age of female Driver");
	           age=s.nextInt();
		      if(age>25){
			 System.out.println("The Driver will get his insurance");
			}else{
			 System.out.println("The Driver will NOT get his insurance");
			}
		      }
	    }	
   
  }
}
