package ArrayList;

import java.util.*;

public class Basics {

    public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        //ArrayList is a part of Java Collection Framework

        //ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Float> list3 = new ArrayList<>();

        //Add: O(1)
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(8);
        // System.out.println(list);

        //Add eleming at a particular index: O(n)
        // list.add(1, 9);
        // System.out.println(list);

        //Get: O(1)
        // int element = list.get(2);
        // System.out.println(element);

        //Remove: O(n)
        // list.remove(2);
        // System.out.println(list);

        //Set: O(n)
        // list.set(2, 10);
        // System.out.println(list);

        //Contains: O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        //Print ArrayList: O(n)
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }

        //Reverse ArrayList: O(n)
        // for (int i = list.size() - 1; i >= 0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }

        //Maximum: O(n)
        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("Max element = " + max);
        
        //Swap
        // int indx1 = 0, indx2 = 4;
        // System.out.println("List before swap" + list);
        // swap(list, indx1, indx2);
        // System.out.println("List after swap" + list);

        //Sort
        // System.out.println(list);
        // Collections.sort(list); //ascending 
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder()); //descending
        // System.out.println(list);

        //2D ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i * 2);
            list3.add(i * 3);
        }
    
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currlist = mainList.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
