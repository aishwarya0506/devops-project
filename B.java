abstract class A
{
 public abstract void callme(); 
}
class B extends A
{
 public void callme()
 {
  System.out.println("this is callme."); 
 }
 public static void main(String[] args)
 {
  B b = new B();
  b.callme();
 }
}