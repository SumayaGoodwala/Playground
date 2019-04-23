import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     for(int i=2 ; i<n ; i++)
     {
       if(prime_series(i))
       {
         System.out.println(i);
       }
    }
    }
  public static boolean  prime_series(int n)
  {
      boolean isprime=true;
       
        int num=2;
       while(num<=n/2)
       {
         if( n%num == 0)
         {
           isprime=false;
           break;
         }
         num++;
      }
    if(isprime == true)
      return true;
    else
      return false;
	}
}