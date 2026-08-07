import java.util.*;
public class First_NonRepeting_char_string {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a stirng");
    String str=sc.nextLine();
    int freq[]=new int[256];
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)==' '){
            continue;
        }
        freq[str.charAt(i)]++;
    }
    for(int i=0;i<256;i++){
        if(freq[str.charAt(i)]==1){
System.out.println("first non repeting character is:"+str.charAt(i));
return;
        }

    }
    sc.close();
   } 
}
