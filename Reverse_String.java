import java.util.*;
public class Reverse_String {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    StringBuilder str=new StringBuilder(sc.nextLine());
    str=str.reverse();
    System.out.println(str);


    /*String str=sc.nextLine();
    char ch[]=str.toCharArray();

   int left=0,right=ch.length-1;
    char temp=' ';
    while(left<right){
     temp=  ch[left];
ch[left]=ch[right];
ch[right]=temp;
    }

    StringBuilder sb=new StringBuilder();*/

    //sb=sc.nextLine();

   } 
}
