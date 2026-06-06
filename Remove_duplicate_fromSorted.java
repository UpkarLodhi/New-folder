import java.util.*;
public class Remove_duplicate_fromSorted {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int size =sc.nextInt();
    // array declaration 
    int arr[]=new int[size];
    // take element by user
    System.out.println("entet the element in array");
    for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt(); 
} 
int x=0;
for(int i=1;i<arr.length;i++){
if(arr[i]!=arr[x]){
    x++;
    arr[x]=arr[i];
}
}
System.out.println("array after remove duplicates");
for(int i=0;i<=x;i++){
    System.out.print(arr[i]+" ");
}
   }
}
