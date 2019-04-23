import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n= in.nextInt();
      int num=1;
      for(int row =1 ; row<= n ;row++)
      {
        for(int col =1 ; col<= row ;col++)
        {
          if(num % 2== 0)
            System.out.print("#");
          else
            System.out.print("*");
          num++;
        }
        System.out.println();
      }
    }
}