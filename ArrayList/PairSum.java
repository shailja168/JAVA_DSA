package ArrayList;

import java.util.ArrayList;

public class PairSum {

    //Brute Force - O(n^2)
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = 0; j < list.size(); j++) {
    //             if (list.get(i) + list.get(j) == target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2 Pointer Approach- O(n)
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    //O(n)
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        
        // find the breaking point
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) { 
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;
        
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //PairSum1: Sorted ArrayList 
        ArrayList<Integer> list = new ArrayList<>();
        // 1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // int target = 5;
        // System.out.println(pairSum1(list, target));


        //PairSum2: Sorted and Rotated ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        // 11, 15, 6, 8, 9, 10
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int target = 161;
        System.out.println(pairSum2(list2,target));
    }
}
