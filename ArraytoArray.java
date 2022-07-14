import java.util.*;
public class ArraytoArray
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();

      int p[]=new int[n];
      int q[]=new int[n];

      for(i=0;i<n;i++)
        {
          System.out.print("Enter Array Elements of p"+"["+i+"]:");
           p[i]=sc.nextInt();
          
        }
      for(i=0;i<n;i++)
        {
           q[i]=p[i];
          
        }
      System.out.println("After swapping of Elemnts from p to q");
      System.out.println("q Array Elements are:");
      for(i=0;i<n;i++)
        {
           System.out.println("q["+i+"]:"+q[i]);
          
        }

      
      
        }
      
    }    
  