import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    int arr[]= new int[n];
    
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
      
    }
    int sum=arr[0];
    for(int j=0;j<n-1;j++)
    {
      if(arr[j]<arr[j+1])
      {
        sum=sum+arr[j+1];
      }
      else
        sum=arr[j+1];
    }
    
    System.out.println(sum);
  }
}