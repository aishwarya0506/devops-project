import java.util.Scanner;
 
class Largest
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
      if ( x > y && x > z )
         System.out.println(" largest no. is "+x);
      else if ( y > x && y > z )
         System.out.println(" largest no. is "+y);
      else if ( z > x && z > y )
         System.out.println(" largest no. is "+z);
}
}