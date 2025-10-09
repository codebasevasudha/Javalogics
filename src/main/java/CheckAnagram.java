/*
 * Check if Two Strings are Anagrams
 * Example: "listen" and "silent" → true
 * sort both strings and then compare
 * */

import java.util.stream.Collectors;

public class CheckAnagram {

    //1st approach
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String sortedStr1 = sortingOfString(str1);
        String sortedStr2 = sortingOfString(str2);
        String result = sortedStr1.equals(sortedStr2) ? "Two Strings are anagram" : "Two Strings are not anagram";
        System.out.println(result);
    }

    private static String sortingOfString(String stringToSort) {

        String sortedString = stringToSort.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        return sortedString;
    }
}
