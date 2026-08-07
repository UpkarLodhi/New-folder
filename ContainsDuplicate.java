import java.util.*;
public class ContainsDuplicate {
 public static void input(int arr[]){
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }                                                        // using hashset.....
}
public static boolean contains_duplicate(int arr[]){
 Set<Integer>set=new HashSet<>();
        // insert all the element in hashset
        for(int val:arr){
            if(!set.contains(val))
            set.add(val);
        else
        return true;
         }
               return false;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter the element ");
        input(arr);
System.out.println(contains_duplicate(arr)); 
sc.close();      
    }
}
