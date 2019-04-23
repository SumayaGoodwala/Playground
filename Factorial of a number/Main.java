import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n= in.nextInt();
      int num=1;
      int facto=1;
      while(num<=n)
      {
        facto=facto*num;
        num++;
      }  
      System.out.println(facto);
	}
}