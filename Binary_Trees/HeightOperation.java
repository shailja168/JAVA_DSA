package Binary_Trees;

public class HeightOperation {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Height: O(n)
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    //Count of Nodes: O(n)
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int lc = countOfNodes(root.left);
        int rc = countOfNodes(root.right);
        return lc + rc + 1;
    }

    //Sum of Nodes:O(n)
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);
        return ls + rs + root.data;
    }

    public static void main(String[] args) {
        /*
                1
              /   \
             2     3
            / \   / \
           4  5   6  7        
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println(height(root));
        // System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));

    }
}
