import java.util.*;
public class Is_palindrome {
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
if(arr[left]!=arr[right]){
    System.out.println("Not palindrome");
    return;
    
}
left++;
right--;
}
System.out.println("palindrome");
sc.close();
    }
}
