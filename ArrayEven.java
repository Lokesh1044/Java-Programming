class ArrayEven
  {
    public static void main(String args[])
    {
      int arr[]={10,20,30,31,35};
      int counteven=0;
      int countodd=0;
      for (int i=0;i<arr.length;i++)
        if(arr[i]%2==0)
         System.out.println("Even Elements:"+arr[i]);
         counteven++;
         System.out.println("CountEven:"+counteven);
      for (int j=0;j<arr.length;j++)
        if(arr[j]%2==1)
         System.out.println("Odd Elements:"+arr[j]);
          countodd++;
         System.out.println("CountOdd:"+countodd);
    }
  }