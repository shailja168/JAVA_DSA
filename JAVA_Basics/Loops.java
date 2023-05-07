import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*Reverse a number*/
        // int n = sc.nextInt();
        // int rev=0;
        // while (n > 0) {
        //     rev = (rev * 10) + (n % 10);
        //     n /= 10;
        // }
        // System.out.println(rev);

        /*Prime no. or not */
        int n = sc.nextInt();
        boolean prime = true;
        if (n == 2){
            prime = true;
        }
        else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime=false;
                    break;
                }
            }
        }  
        if(prime) {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}
