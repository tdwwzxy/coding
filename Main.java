import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a string of 2-9： ");
        while (scanner.hasNext()) {
            String digits = scanner.nextLine();
            List<String> list = letterCombinations(digits);
            System.out.println(list.isEmpty() ? ">>>input error: please input a string of 2-9:" : list.toString());
        }
    }

    public static List<String> letterCombinations(String digits) {
        if(StringUtils.isEmpty(digits)){
            return Collections.emptyList();
        }
        for (char c : digits.toCharArray()) {
            if (c < '2' || c > '9') {
                return Collections.emptyList();
            }
        }

        // recursion
       String[] allLetters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> returnList = new ArrayList<>();
        char[] chars = digits.toCharArray();
        for(char c : allLetters[chars[0] - '0'].toCharArray()){
            returnList.add(c + "");
        }
        for(int i = 1; i < digits.length(); i++){
            List<String> oldList = new ArrayList<>();
            for(String rStr : returnList){
                for(char c : allLetters[chars[i] - '0'].toCharArray()){
                    oldList.add(rStr + c);
                }
            }
            returnList = oldList;
        }

        return returnList;
    }
}
