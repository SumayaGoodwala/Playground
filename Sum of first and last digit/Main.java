import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=0;
      int last_digit=n%10;
      while(n > 0 )
      {
        n=n/10;
        if(n <= 9)
        {
          break;
        }
      }
      int first_digit=n;
      int sum=last_digit+first_digit;
      System.out.println(sum);
	}
}