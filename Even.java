import java.util.*;
public class Even
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();

      int i=1;
      System.out.println("Even No's upto n");
      while(i<=n)
        {
           if(i%2==0)
           {
                  System.out.println(i);
           }
          i=i+1;
        }
      
    }


    
  }