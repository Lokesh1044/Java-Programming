import java.util.Scanner;
class Positivenot
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Number");
    int num=s.nextInt();
    if(num>0)
      System.out.println("Positive");
    else if(num<0)
      System.out.println("Negative");
    else 
      System.out.println("Neutral");
  }
  }