import java.util.*;
public class Odd100
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();

      int i=1;
      System.out.println("Odd No's upto n");
      System.out.println("------------Output----------");
      while(i<=n)
        {
           if(i%2!=0)
           {
                  System.out.println(i);
           }
          i=i+1;
        }
      
    }


    
  }