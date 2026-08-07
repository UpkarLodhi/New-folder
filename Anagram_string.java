import java.util.*;
public class Anagram_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
System.out.println("enter your first string");
String str1=sc.nextLine();
System.out.println("enter your second string");
String str2=sc.nextLine();
int freq[]=new int[256];
// check lenght of both string
System.out.println(str1.length()+","+str2.length());
if(str1.length()!=str2.length()){
    System.out.println("Strings are not anagram");
    return;
}
// traverse first stirng and update(++) frequency array in every iteration
for(int i=0;i<str1.length();i++){
    if(str1.charAt(i)==' '){
        continue;
    }
    freq[str1.charAt(i)]++;
}
// traverse first stirng and update(--) frequency array in every iteration

for(int i=0;i<str2.length();i++){
    if(str2.charAt(i)==' '){
        continue;
    }
    freq[str2.charAt(i)]--;
}
// check  all the index contains 0 of frequency array in yes the anagram..
for(int i=0;i<freq.length;i++){
    if(freq[i]!=0){
        System.out.println("strings are not anagram");
        return;
    }
}
System.out.println("yes string is anagram");
sc.close();
    }
}
