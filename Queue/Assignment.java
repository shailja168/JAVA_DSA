package Queue;

import java.util.*;

public class Assignment {

    //Question 1
    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        while (n-- > 0) {
            String s1 = q.remove();
            System.out.print(s1 + " ");
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }

    //Question 2
    public static int minCost(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int res = 0;
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += (first + second);
            pq.add(first + second);
        }
        return res;
    }

    //Question 3
    static class Job {
        char id;
        int deadline, profit;

        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jobScheduling(ArrayList<Job> arr) {
        int n = arr.size();
        //arrange in order of deadline(earlier deadline first)
        Collections.sort(arr, (a, b) -> {
            return a.deadline - b.deadline;
        });

        ArrayList<Job> result = new ArrayList<>();
        PriorityQueue<Job> maxHeap = new PriorityQueue<>((a, b) -> {
            return b.profit - a.profit;
        });
        for (int i = n - 1; i > -1; i--) {
            int slotAvailable;
            if (i == 0) {
                slotAvailable = arr.get(i).deadline;
            } else {
                slotAvailable = arr.get(i).deadline - arr.get(i - 1).deadline;
            }
            maxHeap.add(arr.get(i));
            while (slotAvailable > 0 && maxHeap.size() > 0) {
                Job j = maxHeap.remove();
                slotAvailable--;
                result.add(j);
            }
        }
        Collections.sort(result, (a, b) -> {
            return a.deadline - b.deadline;
        });

        for (Job job : result) {
            System.out.print(job.id + " ");
        }
    }
    
    //Question 4
    public static void reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        int n = q.size();
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }
    }
    //Question 5
    public static void printMaxOfK(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int i;
        for (i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for (; i < n; i++) {
            System.out.print(arr[dq.peek()] + " ");
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        System.out.print(arr[dq.peek()]);
    }

    public static void main(String[] args) {
        //Question 1
        // int n = 7;
        // generateBinary(n);

        //Question 2
        // int arr[] = { 4, 3, 2, 6 };
        // System.out.println("Min Cost= " + minCost(arr, 4));

        //Question 3
        // ArrayList<Job> arr = new ArrayList<Job>();
        // arr.add(new Job('a', 2, 100));
        // arr.add(new Job('b', 1, 19));
        // arr.add(new Job('c', 2, 27));
        // arr.add(new Job('d', 1, 25));
        // arr.add(new Job('e', 3, 15));
 
        // System.out.println("Following is maximum profit sequence of jobs");
        // jobScheduling(arr);

        //Question 4
        // Queue<Integer> q = new LinkedList<>();
        // q.add(10);
        // q.add(20);
        // q.add(30);
        // q.add(40);
        // q.add(50);
        // q.add(60);
        // q.add(70);
        // q.add(80);
        // q.add(90);
        // q.add(100);
        // reverseFirstK(q, 5);
        // while (!q.isEmpty()) {
        //     System.out.print(q.remove() + " ");
        // }
        
        //Question 5
        int arr[] = { 1, 3, 1, 2, 0, 5 };
        printMaxOfK(arr, arr.length, 3);
        //ans: 3 3 4 5 5 5 6

    }
}