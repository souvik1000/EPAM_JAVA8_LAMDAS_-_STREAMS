import java.util.*;
import java.util.stream.Collectors;

public class PartTwo {
    static List<String> search(List<String> aList) {
        return aList.stream().filter(str -> str.startsWith("a")).filter(str -> str.length()==3).collect(Collectors.toList());
    }

    public static void main(String args[]) {
        List<String> aList = new ArrayList<String>();
        aList.add("sou");
        aList.add("dev");
        aList.add("addi");
        aList.add("ask");
        aList.add("akh");
        aList.add("Akh");
        aList.add("Skh");
        aList.add("app");
        aList.add("agni");
        
        aList=search(aList);
        for(String i:aList)
            System.out.println(i);
    }
    
}