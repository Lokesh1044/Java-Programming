import java.util.*;
class RevArray
  {
    public static void main(String args[])
    {
      int n,i,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Size of an Array");
      n=sc.nextInt();

      int arr[]=new int[n];
     
       
      for(i=0;i<n;i++)
        {
          System.out.print("Enter Array Elements of arr"+"["+i+"]:");
           arr[i]=sc.nextInt();
          
        }
      
      for(i=0;i<n/2;i++)
        {
           temp=arr[i];
          arr[i]=arr[n-1-i];
          arr[n-1-i]=temp;
                    
        }
      
System.out.println("----------OUTPUT----------");
      System.out.println("Array Elemets after Reverse: ");
       for(i=0;i<n;i++)
        {
           
      System.out.println("arr["+i+"]: "+arr[i]);
                    
        } 
     }
      
    }