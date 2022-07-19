import java.util.*;
class MinMaxArray
  {
    public static void main(String args[])
    {
      int n,i,min=0,max=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Size of an Array");
      n=sc.nextInt();

      int arr[]=new int[n];
     
       
      for(i=0;i<n;i++)
        {
          System.out.print("Enter Array Elements of arr"+"["+i+"]:");
           arr[i]=sc.nextInt();
          
        }
      min=arr[0];
      for(i=0;i<n;i++)
        {
           if(arr[i]<min)
           {
             min=arr[i];
           }
          if(arr[i]>max)
           {
             max=arr[i];
           }
          
        }
      System.out.println("----------OUTPUT----------");
      System.out.println("Minimum of Array Elements: "+min);
      System.out.println("Maximum of Array Elements: "+max);
      
        }
      
    }   