import java.util.*;
class EvenOddCount
  {
    public static void main(String args[])
    {
      int n,i,even=0,odd=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Size of an Array");
      n=sc.nextInt();

      int arr[]=new int[n];
     
       
      for(i=0;i<n;i++)
        {
          System.out.print("Enter Array Elements of arr"+"["+i+"]:");
           arr[i]=sc.nextInt();
          
        }
      
      for(i=0;i<n;i++)
        {
           if(arr[i]%2==0)
           {
             even++;
           }
          if(arr[i]%2!=0)
           {
             odd++;
           }
          
        }
      System.out.println("----------OUTPUT----------");
      System.out.println("Even Count Elements in an Array: "+even);
      System.out.println("Odd Count Elements in an Array: "+odd);
      
        }
      
    }