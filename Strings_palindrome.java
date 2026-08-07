import java.util.*;
public class Strings_palindrome {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    System.out.println("enter a string ");
String str=sc.nextLine();
str=str.replace(" ","").toLowerCase();
for(int i=0;i<str.length()/2;i++){
    if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        System.out.println("string is not palindrome");
        return;
    }
}
System.out.println("string is palindrome");

sc.close();
   }


}
