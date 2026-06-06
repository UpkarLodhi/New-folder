import java.util.*;
public class two_sum {
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
    System.out.println("enter the target ");
    int target=sc.nextInt();
    int left=0;
    int right=arr.length-1;
while (left<right) {
    if(arr[left]+arr[right]==target){
        System.out.println("the sum of "+arr[left]+" and "+arr[right]+" is " + target);
    }
    if(arr[left]+arr[right]<target){
        left++;
    } 
    else{
        right--;
    }
}
sc.close();
   } 
}
