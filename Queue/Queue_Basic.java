package Queue;

// import java.util.*;

public class Queue_Basic {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        // static int arr[];
        // static int size;
        // static int rear;

        // Queue(int n) {
        //     arr = new int[n];
        //     size = n;
        //     rear = -1;
        // }
        // public static boolean isEmpty() {
        //     return rear == -1;
        // }
        // //add: O(1)
        // public static void add(int data) {
        //     if (rear == size - 1) {
        //         System.out.println("Queue is full");
        //         return;
        //     }
        //     rear = rear + 1;
        //     arr[rear] = data;
        // }
        // //remove: O(n)
        // public static int remove() {
        //     if (isEmpty()) {
        //         System.out.println("Queue is empty");
        //         return -1;
        //     }
        //     int front = arr[0];
        //     for (int i = 0; i < rear; i++) {
        //         arr[i] = arr[i + 1];
        //     }
        //     rear--;
        //     return front;
        // }
        // //peek: O(1)
        // public static int peek() {
        //     if (isEmpty()) {
        //         System.out.println("Queue is empty");
        //         return -1;
        //     }
        //     return arr[0];
        // }
        
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }
        //add: O(1)
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        //remove: O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            //single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }
        //peek: O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        // Queue q = new Queue();
        // Queue<Integer> q = new LinkedList<>(); 
        // Queue<Integer> q = new ArrayDeque<>();

        // q.add(1);
        // q.add(2);
        // q.add(3);
        // //1 2 3

        // while (!q.isEmpty()) {
        //     System.out.println(q.remove());
        // }
    }
}