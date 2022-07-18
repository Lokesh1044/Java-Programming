import java.util.*;
public class Multiply2dArray
  {
    public static void main(String args[])
    {
      int row,col,i,j,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter No of Rows: ");
      row=sc.nextInt();
      System.out.println("Enter No of Columns: ");
      col=sc.nextInt();

      int p[][]=new int[row][col];
      int q[][]=new int[row][col];
      int result[][]=new int[row][col];
      
    
      
System.out.println("Enter P Array Elements ");
      System.out.println("----------------------");
      
      for(i=0;i<row;i++)
        {
          for(j=0;j<col;j++)
            {
          System.out.print("Enter Array Elements of p"+"["+i+"]"+"["+j+"]:");
           p[i][j]=sc.nextInt();
            }
          
        }

System.out.println("Enter Q Array Elements ");
      System.out.println("----------------------");
      
      for(i=0;i<row;i++)
        {
          for(j=0;j<col;j++)
            {
          System.out.print("Enter Array Elements of q"+"["+i+"]"+"["+j+"]:");
           q[i][j]=sc.nextInt();
            }
          
        }


      
       System.out.println(" ");
   System.out.println("P Array Elements are: ");  
      
     for(i=0;i<row;i++)
        {
          for(j=0;j<col;j++){
             System.out.print(p[i][j]+" ");
        }System.out.println(" ");
        }
      System.out.println(" ");
       System.out.println("P Array Elements are: "); 
    for(i=0;i<row;i++)
        {
          for(j=0;j<col;j++){
             System.out.print(q[i][j]+" ");
        }System.out.println(" ");
        }


      

      for(i=0;i<row;i++)
        {
          for(j=0;j<col;j++){
            result[i][j]=p[i][j]*q[i][j];
            }
          
        }


      
      System.out.println(" ");
     System.out.println( "Multiply of Array Elements of Both P and Q Arrays: ");
      System.out.println("--------Output--------");
      for(i=0;i<row;i++)
        {
          for(j=0;j<col;j++){
      System.out.print(result[i][j]+" ");
            }System.out.println(" ");
         }
    }
  }