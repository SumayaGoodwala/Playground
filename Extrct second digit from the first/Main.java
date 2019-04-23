import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=0;
      
      while(n > 0 )
      {
        if(n <= 99)
        {
          break;
        }
        n=n/10;
        
      }
      int s_d=n%10;
      System.out.println(s_d);
	}
}