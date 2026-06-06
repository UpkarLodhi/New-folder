import java.util.*;
public class Reverse_array {
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
int left=0;
int right=arr.length-1;
while(left<right){
 int temp=arr[left];
arr[left]=arr[right];
arr[right]=temp;
left++;
right--;
}
System.out.println("array after reverse");
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
}
sc.close();
}
}
