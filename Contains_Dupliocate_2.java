
import java.util.*;
 public class Contains_Dupliocate_2 {
    public static boolean cd2(int nums[],int k){
Map<Integer,Integer>map=new HashMap<>();
for(int i=0;i<nums.length;i++){
    if(map.containsKey(nums[i])){
        if(i-map.get(nums[i])<=k)
        return true;
        
    }
    map.put(nums[i],i);
}
return false;
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
System.out.println("enter the size of array");
int n=sc.nextInt();
int nums[]=new int[n];
System.out.println("enter the element in array");
for(int i=0;i<n;i++){
    nums[i]=sc.nextInt();
}
    System.out.println("enter the value of k");
    int k=sc.nextInt();
    System.out.println(cd2(nums,k));
    sc.close();
}

    }

