import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
      int n= in.nextInt();
      int a[]= new int[n];
      
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      
      int l=0;
      int r=n-1;
      int pal=1;
      while(l<r)
      {
        if(a[l] != a[r])
        {  pal=0;
          break;
        }
        else 
        {
          l++;
          r--;
        }
      }
      if(pal == 1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
