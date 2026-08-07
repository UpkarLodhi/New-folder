import java.util.*;
public class SingleNumber {                       // in this problem each number appear twice except one number
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter the element in array");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int sum1=0;
int sum2=0;
// create hasset
Set<Integer>set=new HashSet<>();
for(int val:arr){
    sum1=sum1+val;
    if(!set.contains(val)){
set.add(val);
sum2=sum2+val;
    }
}
int result=2*sum2-sum1;
System.out.println("The single number is: " + result);
sc.close();

   } 
}
/* optmize approch
for(int val:arr) 
res=res^val*/ 

/* using hashmap
create a hashmap
put the element in hashmap
if element is alareddy esist then incress its count
Map<Integer,Integer>map=HashMap<>();
for(int val:arr){
if(map.ContainsKey(val)){
map.put(val,2)
}
else{
    map.put(val,0)
}
}
....  now iterate on the map and find the element whose count is 1.....
for(int val:arr){
if(map.get(val))==1
returnn val
}
 other vise return -1 means no single element exist
*/