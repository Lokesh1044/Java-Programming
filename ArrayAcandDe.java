import java.util.*;
class ArraSort
  {
    public static void main(String args[])
    {
      int n,i,j;
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
            for(j=i+1;j<n;j++)
            {
               int temp=0;
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        }
        
        System.out.println("Array Elements in Ascending Sorted Order ");
       for(i=0;i<n;i++) 
       {
           System.out.println(arr[i]);
       }
        
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
               int temp=0;
            if(arr[i]<arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            }
        }
        
        
         System.out.println("Array Elements in Decending Sorted Order ");
       for(i=0;i<n;i++) 
       {
           System.out.println(arr[i]);
       }
      
      
        }
      
    }   