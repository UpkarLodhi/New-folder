import java.util.*;
public class Move_zeros {
    public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
  int n=sc.nextInt();
  int arr[]=new int[n];
  for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
  }  
  int x=0;
  for(int i=0;i<n;i++){
    if(arr[i]!=0){
arr[x++]=arr[i];
    }
  }
  for(int i=x;i<n;i++){
    arr[i]=0;
  }
  for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
  }
  sc.close();
}
}