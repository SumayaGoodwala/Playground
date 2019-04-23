
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String st1= in.nextLine();
      String st2= in.nextLine();
      int st1_len=st1.length();
      int st2_len=st2.length();
      StringBuilder sb= new StringBuilder(st1);
      StringBuilder temp= new StringBuilder(st2);
      int count=0;
     for(int i=0 ; i<(st1_len - st2_len + 1) ; i++)
      {
       boolean is_sub=true;
       for(int j=0 ; j<st2_len ; j++)
       {
        if(sb.charAt(i+j) != temp.charAt(j))
           {
             is_sub=false;
           }
       }
        if(is_sub==true)
          count++;
      }
      
        
          System.out.println(count);
      
    } 
}

