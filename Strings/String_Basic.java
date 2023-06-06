package Strings;

import java.util.Scanner;

public class String_Basic {

    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());

        //concatenation
        // String firstname = "Shailja";
        // String lastname = "Tripathi";
        // String fullname = firstname + " " + lastname;

        // System.out.println(fullname.charAt(5));
        // printLetters(fullname);

        //StringBuilder
        StringBuilder sb = new StringBuilder("");
        for (char i = 'a'; i <= 'f'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
    }
}
