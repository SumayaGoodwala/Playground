import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int a[]= new int[n];
      
      for(int i=0 ;i<n;i++)
        a[i]=in.nextInt();
      int idx=0;
      for(int i = 0; i < n; i++)
        {
           if(a[i] != 0)
           {
             a[idx]=a[i];
             idx++;
           }
        }
      
      for(int i=idx;i<n;i++)
      {
         a[i]=0;
      }
      
       for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}