// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class UniqueWords
  {
    public static void main(String args[])
    {
      int n,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String");
      String s=sc.nextLine();

      String words[]=s.split(" ");
      
     
     System.out.println("Words in a Given String are: ");
     for(i=0;i<words.length;i++)
     {
        System.out.println(words[i]); 
     }
     
     
     System.out.println("Unique Words in a Given String are: ");
     for(i=0;i<words.length;i++) 
     {
     for(j=i+1;j<words.length;j++)
     {
       if(words[i].equals(words[j])) 
       {
         words[i]="\0";
          words[j]="\0";
       }
     }
     }
     
     for(i=0;i<words.length;i++)
     {
        System.out.println(words[i]); 
     }
     
    }   
      
      
        }
      
       
