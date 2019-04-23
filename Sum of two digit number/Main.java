import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int nf=n1/10;
      int nl=n1%10;
      float result=nf+nl;
      System.out.println(result);
	}
}