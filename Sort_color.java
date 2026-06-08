import java.util.*;
public class Sort_color {
public static void main(String args[]){
    Scanner sc=new  Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the element in array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int first=0,mid=0,last=n-1;
    while(mid<=last){
        if(arr[mid]==0){
// swap mid and first and increment both
int temp=arr[mid];
arr[mid]=arr[first];
arr[first]=temp;
mid++;
first++;
        }
        else if(arr[mid]==1){
            mid++;
        }
        else{
int temp=arr[mid];
arr[mid]=arr[last];
arr[last]=temp;

last--;
        }
    }
    // print output
    for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
    }
    sc.close();
}

}
