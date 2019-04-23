import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      
     Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    int arr[]= new int[n];
    
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();  
    }
      int count[]=new int[10];
      
      for(int i=0;i<n;i++)
    {
      count[i]=0;  
    }
      int max=0;
      int ic=0;
      for(int j=0;j<n;j++)
    {
        ic= arr[j]-0;
        count[ic]++;   
     }
      for(int j=0;j<n;j++)
      {
        if(count[j]>max)
          max=arr[j]; 
          
      }
      if(max == 1)
        max=arr[0];
      
      System.out.println(max);
      
    }
}