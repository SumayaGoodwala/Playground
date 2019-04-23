import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	   int  greatest= g_of_3_numbers(n1 , n2 , n3);
      System.out.println(greatest);
	}
	// Function to find the gcd of 2 numbers
	public static int g_of_3_numbers(int num1, int num2, int num3)
	{
	    int max_element, max;
	    if(num1 > num2)
	    {
	        max_element = num1;
	    }
	    else{
	        max_element = num2;
	    }
      if(max_element > num3)
	    {
	        max = max_element;
	    }
	    else{
	        max = num3;
	    }
      
	   return max;
	}
}