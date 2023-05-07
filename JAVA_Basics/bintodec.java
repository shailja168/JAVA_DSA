import java.util.Scanner;

public class bintodec {

    public static int binaryToDecimal(int bin) {
        int dec = 0, pow = 0;
        while (bin > 0) {
            dec += ((bin % 10) * (int) Math.pow(2, pow++));
            bin /= 10;
        }
        return dec;
    }
    
    public static int decimalToBinary(int dec) {
        int bin = 0, pow =0;
        while (dec > 0) {
            bin += ((dec % 2) * (int) Math.pow(10, pow++));
            dec /= 2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter binary number: ");
        // int bin = sc.nextInt();
        // System.out.println("Decimal equivalent: " + binaryToDecimal(bin));

        System.out.print("Enter decimal number: ");
        int dec = sc.nextInt();
        System.out.println("Binary equivalent: " + decimalToBinary(dec));

    }
}
