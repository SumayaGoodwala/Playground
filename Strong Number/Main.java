import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int rem , facto;
      int sum= 0;
      int n1=n;
      while(n > 0)
      {
        facto=1;
        rem=n % 10;
        for(int num=2;num<= rem; num++)
        {
         facto=facto * num ;
        }
        sum=sum+facto;
        n= n / 10;
      }
      if(n1 == sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}