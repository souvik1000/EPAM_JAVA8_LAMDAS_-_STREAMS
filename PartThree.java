import java.util.*;
import java.util.stream.IntStream;

public class PartThree {
    static List<String> palindrome (List<String> aList) {
        List<String> aListOne = new ArrayList<String>();
        for(String i:aList) {
            int len = i.length();
            if( IntStream.range(0,len/2).noneMatch(j -> i.charAt(j) != i.charAt(len-j-1)))   //false of false is sending true in if condition
                aListOne.add(i);
        }
        return aListOne;
    }
    public static void main(String args[]) {
        List<String> aList = new ArrayList<String>();
        aList.add("121");
        aList.add("aba");
        aList.add("abc");
        aList.add("abac");
        aList.add("12321");
        aList.add("abcba");
        aList.add("abcde");
        aList.add("Abcba");
        
        aList=palindrome(aList);

        for(String i:aList)
            System.out.println(i);
    }
}