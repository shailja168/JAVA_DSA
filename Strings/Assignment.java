package Strings;

import java.util.Arrays;

public class Assignment {

    //Question 1
    public static int countLowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    
    //Question 4
    public static boolean anagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char str1CharArray[] = str1.toCharArray();
            char str2CharArray[] = str2.toCharArray();

            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            if (Arrays.equals(str1CharArray, str2CharArray)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        //Question 1
        // String str = "Wow what where";
        // System.out.println(countLowerCase(str));

        //Question 2
        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        //Question 3
        // String str2="ApnaCollege".replace("l","");
        // System.out.println(str2);

        //Question 4
        String str1 = "race", str2 = "care";
        if (anagram(str1, str2)) {
            System.out.println("Anagrams");
        }
        else {
            System.out.println("NOT Anagrams");
        }
    }
}
