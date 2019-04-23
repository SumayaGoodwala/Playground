import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String st= in.nextLine();
      int st_len=st.length();
      StringBuilder sb= new StringBuilder(st);
      int front=0;
      int end=st_len-1;
      boolean is_palindrom=true;
      
     while(front<end)
      {
        if(sb.charAt(front) != sb.charAt(end))
           {
             is_palindrom=false;
           }
        front++;
       end--;
      }
      
        if(is_palindrom==true)
          System.out.println("Yes");
      else
        System.out.println("No");
      
    } 
}
