import java.util.Scanner;

public class sort_zero_one {
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
while (left<right) {
    if(arr[left]==1&&arr[right]==0){
        // swap
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }
    if(arr[left]==0){
        left++;
    }
    if(arr[right]==1){
        right--;
    }
}
System.out.println("array after sort");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
sc.close();
}
}
