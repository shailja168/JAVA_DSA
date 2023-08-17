import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Indian_Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        //coins in descending order
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins, Collections.reverseOrder());

        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < coins.length; i++) {
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    count++;
                    ans.add(coins[i] );
                    amount -= coins[i];
                }
            }   
        }

        System.out.println("total min coins/notes used = " + count);
        // System.out.println("amount= "+amount);
        
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
