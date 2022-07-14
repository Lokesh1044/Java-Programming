import java.util.Scanner;
class Biggest
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter no1");
    int num1=s.nextInt();
    System.out.println("Enter no2");
    int num2=s.nextInt();
    System.out.println("Enter no3");
    int num3=s.nextInt();
    if((num1>num2)&(num1>num3))
      System.out.println("Num1 is Big");
    else if(num2>num3)
      System.out.println("Num2 is Big");
    else 
      System.out.println("Num3 is Big");
  }
  }