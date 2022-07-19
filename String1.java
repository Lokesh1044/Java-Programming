class String1
  {
    public static void main(String args[])
    {
      char chars[]={'a','b','c','d'};

      
      // Creation of Empty String
       String s=new String();


      //String with Literals 
      String s1=new String("Welcome to Java");


      //String with Character Array
      String st=new String(chars);



      //Charcter array with Range 
      String str=new String(chars,0,3);


      //String with Another String 
      String str2=new String(s1);

      System.out.println(s);
      System.out.println(s1);
      System.out.println(st);      
      System.out.println(str);
      System.out.println(str2);
    }


      }