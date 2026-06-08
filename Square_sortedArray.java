import java.util.*;
public class Square_sortedArray {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int result[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        // square
        arr[i]=arr[i]*arr[i];
    }
int left=0;
int right=n-1;
int pos=n-1;
while(left<right){
if(arr[left]>arr[right]){
    result[pos]=arr[left];
    pos--;
    left++;
}
else{
    result[pos]=arr[right];
    pos--;
    right--;
}
}

for(int i=0;i<n;i++){
    System.out.print(result[i]+" ");
}
sc.close();
  }  
}
