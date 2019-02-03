/*
 * This is a program to print a diamond pattern of edge length 'n' and having an inner hollow diamond in it.
 * eg. edge length = 4
 *         *
 *        ***
 *       ** **
 *      **   **
 *       ** **
 *        ***
 *         *
 */
import java.io.*;
public class diamond
{
    public static void main()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int n,s,r,x,i,j,f,q,l;
        System.out.println(" This is a program to print a diamond pattern of edge length 'n and having an inner hollow diamond in it.");
        System.out.println(" Example : edge length=4");
        System.out.println("   1   ");
        System.out.println("  111  ");
        System.out.println(" 11 11 ");
        System.out.println("11   11");
        System.out.println(" 11 11 ");
        System.out.println("  111  ");
        System.out.println("   1   ");
        System.out.print("Enter the edge length: ");
        n=Integer.parseInt(in.readLine());
        f=n-1;
        s=n-1;
        r=n/2;
        x=n%2;
        if(x==1)
            l=r+1;
        else
             l=r;
        if(f%2==0)
            q=(f/2)-1;
        else
            q=f/2; 
        for(i=1;i<=l;i++) 
        {
            for(j=1;j<=s;j++) 
            {
                System.out.print(" ");
            }
            s--;
            for(j=1;j<= 2*i-1;j++) 
            {
                System.out.print("1");                
            }
            System.out.println("");
        }
        for(i=l+1;i<=n;i++) 
        {
            for(j=1;j<=s;j++) 
            {
                System.out.print(" ");
            }
            s--;
            for(j=1;j<=l;j++) 
            {
                System.out.print("1");                
            }
            for(j=1;j<=(2*i-1)-n;j++) 
            {
                System.out.print(" ");                
            }
            for(j=1;j<=l;j++) 
            {
                System.out.print("1");                
            }
            System.out.println("");
        }
        s=1;
        for(i=1;i<=q;i++) 
        {
            for(j=1;j<=s;j++) 
            {
                System.out.print(" ");
            }
            s++;
            for(j=1;j<=l;j++) 
            {
                System.out.print("1");                
            }
            for(j=1;j<=(2*f)-1-n;j++) 
            {
                System.out.print(" ");                
            }
            for(j=1;j<=l;j++)
            {
                System.out.print("1");                
            }
            f=f-1;
            System.out.println("");
        }
        for(i=f;i>=1;i--) 
        {
            for(j=1;j<=s;j++) 
            {
                System.out.print(" ");
            }
            s++;
            for(j=1;j<=2*i-1;j++) 
            {
                System.out.print("1");
            }
            System.out.println("");
        }
    }
}
