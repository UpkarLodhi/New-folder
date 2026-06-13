import java.util.*;
public class Container_with_mostWater {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the walls");
 int n=sc.nextInt();
 int arr[]=new int[n];
 System.out.println("enter the height of each wall");
 for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
 }
 int left=0,right=n-1;
 int volume=0;
 while(left<right){
    int width=right-left;
    int height=Math.min(arr[right],arr[left]);
    int curr_volume=width*height;
    volume=Math.max(volume, curr_volume);
if(arr[left]<arr[right]){
    left++;
}
else{
    right--;
}
 }
 System.out.println("container with most water "+ volume);
 sc.close();
    }
}
