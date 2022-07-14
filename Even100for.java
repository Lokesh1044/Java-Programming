import java.util.*;
public class Even100for
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();

      System.out.println("Even No's upto n");
      System.out.println("------------Output----------");
      for(int i=1;i<=n;i++)
        {
           if(i%2==0)
           {
                  System.out.println(i);
           }
          
        }
      
    }


    
  }