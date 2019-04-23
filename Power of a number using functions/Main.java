import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int b = in.nextInt();
      int e = in.nextInt();
      power(b,e);
	}
  public static void power(int bs,int ex)
  {int p=1;
    for(int i=1;i<=ex ;i++)
      p=p*bs;
    System.out.println(p);
  }
}