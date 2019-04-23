import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int rem,rev=0;
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      while(n!=0)
      {
        
        rem=n%10;
        rev=rev*10+rem;
        n=n/10;
      }
      System.out.println(rev);
  }
}