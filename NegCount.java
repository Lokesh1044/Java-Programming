import java.util.*;
class NegCount
  {
    public static void main(String args[])
    {
      int n,i,count=0;
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
           if(arr[i]<0)
           {
             count++;
           }
                    
        }
      System.out.println("----------OUTPUT----------");
      System.out.println("Negative Elements Count in an Array: "+count);
      
      
        }
      
    }