/*Given a string  contians only lower lette print how time each character appers. 
 answer => in this problem we have given a condition that is an entire string holds on lower letters 
 means a to z so we not need to create an array of size 256 we have need to create an array of size 26
 that indexing from started from 97 to 122 */
import java.util.*;
public class Contains_only_lower_letter_frequecy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        String str= sc.nextLine();
        int freq[]=new int[26];
        for(int i=0;i<str.length();i++){
freq[str.charAt(i)-97]++;
        }
        // print occurence of each character.
        for(int i=0;i<str.length();i++){
            if(freq[str.charAt(i)-97]>0){
                System.out.println(str.charAt(i)+":"+freq[str.charAt(i)-97]);
                // avoid print again and again
                freq[str.charAt(i)-97]=0;
            }
        }
        sc.close();
    }
}
