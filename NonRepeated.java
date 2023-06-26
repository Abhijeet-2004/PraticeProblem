
/* Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
a. 1 <= s.length <= 10^5
b. s consists of only lowercase English letters. */
import java.util.HashMap;
import java.util.Scanner;

public class NonRepeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=sc.next();
        System.out.println("Non repeating charecter index is:"+firstNonRepeatingChar(str));
        sc.close();

    }
    public static int firstNonRepeatingChar(String str){
        HashMap<Character,Integer> hs=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hs.containsKey(str.charAt(i))){
                hs.put(str.charAt(i),hs.get(str.charAt(i))+1);
            }
            else{
                hs.put(str.charAt(i), 1);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(hs.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
