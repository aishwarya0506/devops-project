import java.io.*;
import java.util.*;
class Perfect
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter a number:");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
            System.out.println("\n perfect number");
        else
            System.out.println("\n not a perfect number");
    }
}