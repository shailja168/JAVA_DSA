import java.util.Scanner;

public class palindrome {

    public static boolean palindrome(int n) {
        int rev = 0, orig = n;
        while (n > 0) {
            rev = (rev*10) + (n % 10);
            n /= 10;
        }
        if (rev == orig)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = sc.nextInt();
        if (palindrome(n)) {
            System.out.println(n + " is palindrome");
        }
        else {
            System.out.println(n + " is NOT a palindrome");
        }
    }
}
