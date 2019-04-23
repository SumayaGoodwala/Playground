import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in= new Scanner(System.in);
    int n=in.nextInt();
    for(int cnt=1;cnt<=n;cnt++)
    {
      System.out.print(cnt);
      if((cnt % 3 == 0) && (cnt != n))
        System.out.print(",");
    }
  }
}