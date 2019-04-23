import java.util.Scanner;
import java.lang.Math; 
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int rem, digit_count=0 ;
      double sum= 0;
      int n1=n , n2=n;
      while(n > 0)
      {
        n= n / 10;
        digit_count++;
      }
      
      while(n1> 0)
      {
       rem= n1 % 10;
       sum= sum+(Math.pow(rem,digit_count)); 
        n1= n1 / 10;
      }
      if(n2 == sum)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}