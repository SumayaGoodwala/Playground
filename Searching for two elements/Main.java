import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int arr_size= sc.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0 ; i<arr_size ; i++)
      {
        arr[i]= sc.nextInt();
      }
      int search_e1= sc.nextInt();
      int search_e2= sc.nextInt();
      int f1=-1,f2=-1;
      for(int i=0 ; i<arr_size ; i++)
      {
        if(arr[i] == search_e1)
          f1=i;
        
        if(arr[i] == search_e2)
          f2=i;
      }
      
      System.out.println(f1);
     System.out.println(f2);
    }
}