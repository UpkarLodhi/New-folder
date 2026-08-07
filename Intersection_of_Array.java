import java.util.*;
public class Intersection_of_Array {
    public static void input1(int arr1[]){
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr1.length;i++){
    arr1[i]=sc.nextInt();
}
    }
     public static void input2(int arr2[]){
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr2.length;i++){
    arr2[i]=sc.nextInt();
}
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n=sc.nextInt();
        int arr1[]= new int[n];
        System.out.println("enter the size of second array");
        int m=sc.nextInt();
      int arr2[]= new int[m];
System.out.println("enter the element in first array");
input1(arr1);
System.out.println("enter the element in second array");
input2(arr2);
// .... approch 1... create two set and use retainAll() method
Set<Integer>set1=new HashSet<>();
Set<Integer>set2=new HashSet<>();
for(int val:arr1){
    if(!set1.contains(val)){
        set1.add(val);
    }
}
for(int val:arr2){
    if(!set2.contains(val)){
        set2.add(val);
    }
}
set1.retainAll(set2);
System.out.print(" intersection of both array is:" +set1);

/* 
//... approch 2.....
// creaate a list...
List<Integer>list=new ArrayList<>();
Set<Integer>set=new HashSet<>();
for(int val:arr1) {
    if(!set.contains(val)){
        set.add(val);
    }
}
// now check the comman element between set and second array...
for(int val:arr2){
    if(set.contains(val)){
        list.add(val);
    }
}
System.out.print("comman element between arr1 and arr2 is:"+list );
for(int val:list){
    System.out.print(val+" ");
}*/
sc.close();

    }
}
