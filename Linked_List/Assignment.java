package Linked_List;

public class Assignment {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addFirst(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    //Question 1
    //Time Complexity  : O(m*n)
    public static Node getIntersectioNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

    //Question 2
    //Time Complexity  : O(n)
    public static void skipMdeleteN(Node head, int m, int n) {
        Node curr = head;
        Node temp;
        int count = 1;

        while (curr != null) {
            //skip m nodes
            for (count = 1; count < m && curr != null; count++) {
                curr = curr.next;
            }
            if (curr == null) {
                return;
            }
            //delete n nodes
            temp = curr.next;
            for (count = 1; count <= n && temp != null; count++) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
    }

    //Question 3
    //Time Complexity  : O(n)
    public static void swapNodes(Node head, int x, int y) {
        if (x == y) {
            return;
        }

        Node currX = head, prevX = null;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node currY = head, prevY = null;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }

        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    
    //Question 4
    //Time Complexity  : O(n)
    public static Node evenOddLL(Node head) {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node curr = head;

        while (curr != null) {
            //even
            if (curr.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = curr;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            }
            //odd
            else {
                if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
            curr = curr.next;
        }

        if (oddStart == null || evenStart == null) {
            return head;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
        return head;
    }
    
    //Question 5
    //Time Complexity  : O(n*logk)
    public static Node sortedMerge(Node head1, Node head2) {
        Node result = null;
        if (head1 == null) {
            return head2;
        }
        else if (head2 == null) {
            return head1;
        }
       
        if (head1.data <= head2.data) {
            result = head1;
            result.next = sortedMerge(head1.next, head2);
        }
        else {
            result = head2;
            result.next = sortedMerge(head1, head2.next);
        }
        return result;
    }
    public static Node mergeKLists(Node arr[], int last) {
        while (last != 0) {
            int i = 0, j = last;
            while (i < j) {
                arr[i] = sortedMerge(arr[i], arr[j]);
                i++;
                j--;
                if (i >= j) {
                    last = j;
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        //Question 1
        //    4->5->6->7->null
        // 1->2->3->6->7->null 
        // Node head1 = new Node(4);
        // head1.next = new Node(5);
        // head1.next.next = new Node(6);
        // head1.next.next.next = new Node(7);
        // printLL(head1);

        // Node head2 = new Node(1);
        // head2.next = new Node(2);
        // head2.next.next = new Node(3);
        // head2.next.next.next = head1.next.next; //connecting to 6
        // printLL(head2);
         
        // Node intersectionPoint = getIntersectioNode(head1, head2);
        // if (intersectionPoint == null) {
        //     System.out.println("no intersection point");
        // }
        // else {
        //     System.out.println("Intersection Point: " + intersectionPoint.data);
        // }

        //Question 2
        // Node head = new Node(8);
        // head = addFirst(head, 7);
        // head = addFirst(head, 6);
        // head = addFirst(head, 5);
        // head = addFirst(head, 4);
        // head = addFirst(head, 3);
        // head = addFirst(head, 2);
        // head = addFirst(head, 1);
        // printLL(head);
        // skipMdeleteN(head, 3, 2);
        // printLL(head);

        //Question 3
        // Node head = new Node(6);
        // head = addFirst(head, 5);
        // head = addFirst(head, 4);
        // head = addFirst(head, 3);
        // head = addFirst(head, 2);
        // head = addFirst(head, 1);
        // printLL(head);
        // swapNodes(head, 2, 5);
        // printLL(head);

        //Question 4
        // Node head = new Node(6);
        // head = addFirst(head, 1);
        // head = addFirst(head, 4);
        // head = addFirst(head, 5);
        // head = addFirst(head, 10);
        // head = addFirst(head, 12);
        // head = addFirst(head, 9);
        // printLL(head);
        // head = evenOddLL(head);
        // printLL(head);

        //Question 5
        int k = 3; //no. of LL
        // int n = 4; //no. of elements in each LL
        Node arr[] = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);
        
        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = mergeKLists(arr, k - 1);
        printLL(head);
    }
}
