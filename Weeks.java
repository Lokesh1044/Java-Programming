import java.util.Scanner;
class Weeks
  {
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Number");
    int num=s.nextInt();
    switch(num){
      case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
          case 3:
          System.out.println("Wednesday");
          break;
          case 4:
          System.out.println("Thursday");
          break;
          case 5:
          System.out.println("friday");
          break;
          case 6:
          System.out.println("Tuesday");
          break;
        case 0:
          System.out.println("Sunday");
          break;
        default:
          System.out.println("Enter Number between 0-7");
          break;
          
    }
  }
  }