import java.util.*;

public class leap_year {

    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year");
        }

        // System.out.println(sum(2, 4));
        // System.out.println(sum(2,6));
    }
}
