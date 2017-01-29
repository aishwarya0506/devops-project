import java.net.*;
import java.rmi.*;
public class AddServer
{
public static void main(String args[])
{
try 
{
AddServerlmpladdServerlmpl=new AddServerlmpl();
Naming.rebind("AddServer",addserverlmpl);
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
