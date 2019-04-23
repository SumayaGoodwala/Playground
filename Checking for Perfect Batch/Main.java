import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in= new Scanner(System.in);
    int n= in.nextInt();
    int a[]=new int[n];
    
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    
    perfect_3b(a,n);
  }
  
  public static void perfect_3b(int[] a,int n)
  {
    boolean batch=false;
    int ini_sum=a[0]+a[1]+a[2];
    
    for(int i=3;i<n;i=i+3)
    {
      int cur_sum=a[i]+a[i+1]+a[i+2];
      if(cur_sum != ini_sum)
      {
        batch=true;
        
      }
    }
    if(batch == true)
      System.out.println("Not a Perfect Batch");
    else
      System.out.println("Perfect Batch");
  }
}