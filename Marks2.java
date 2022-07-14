import java.util.Scanner;
class Marks2
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Project");
    int P=s.nextInt();
    System.out.println("Enter Internal");
    int I=s.nextInt();
    System.out.println("Enter External");
    int E=s.nextInt(); 

    if((P>=50)&(I>=50)&(E>=50))
       System.out.println("You have Passed in 3 Subject");
    else 
      System.out.println("You have Failed");
    
  
  System.out.println("Total="+"P+I+E="+(P+I+E));
    

    int Percentage=((P*90/100)+(I*87/100)+(E*95/100))/3;
      System.out.println("Percentage="+Percentage);
    if(Percentage>90)
      System.out.println("A Grade");
    else if((Percentage<90)&(Percentage>70))
      System.out.println("B Grade");
    else
      System.out.println("C Grade");
}
  }