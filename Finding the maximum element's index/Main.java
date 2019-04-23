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
    
    int max_idx=0;
    if(a[0] > a[1])
      max_idx=0;
    else
      max_idx=1;
    
    for(int i=2;i<n;i++)
    {
      if(a[i]>a[max_idx])
        max_idx=i;
      
    }
    System.out.println(max_idx);
    
  }
}