import java.util.*;
public class Reverse
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value");
      n=sc.nextInt();

      int i=n;
      System.out.println("Natural No's upto n in Reverse Order");
      while(i>=1)
        {

          System.out.println(i);
          i=i-1;
        }
      
    }


    
  }