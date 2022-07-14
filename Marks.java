import java.util.Scanner;
class Marks
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter m1");
    int m1=s.nextInt();
    System.out.println("Enter m2");
    int m2=s.nextInt();
      System.out.println("Total="+(m1+m2));
      System.out.println("Average="+((m1+m2)/2));
  }
  }