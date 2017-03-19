import java.util.Scanner;

class Leap
 {
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter a Year :");
    Scanner input = new Scanner(System.in); //for getting an input 
    num = input.nextInt();
   if ( num % 4 == 0 ) 
        System.out.println(" leap year ");
     else
        System.out.println("not leap year");
  }
}