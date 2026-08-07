import java.util.*;
public class Frequency_count_string {
  /*public static void main(String[] args) {
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
    // print the occurence of each character
    for(int i=0;i<str.length();i++){
if(str.charAt(i)!=' '&& freq[str.charAt(i)]>1){
  System.out.println(str.charAt(i)+": "+freq[str.charAt(i)]);
  // prevent printing same chaacter again
  freq[str.charAt(i)]=0;
}
    }
    sc.close();
  }  */
 // Another soluation...
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a stirng");
  String str=sc.nextLine();
  str=str.replace(" ","");
  // create a frequency array.... of size 256..
  int freq[]=new int [256];
  for(int i=0;i<str.length();i++){
    freq[str.charAt(i)]++;
  }
  // print the frequency of each character
  for(int i=0;i<str.length();i++){
    if(freq[str.charAt(i)]>1){
      System.out.println(str.charAt(i)+":"+freq[str.charAt(i)]);
      // avoid repeted printing
      freq[str.charAt(i)]=0;
    }

  }
  sc.close();
 }
}
