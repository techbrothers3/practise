import java.util.LinkedList;

public class MergeTwoLinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    static Node solve(Node l, Node m) {
        int pos = 1;
        Node ans = l;
        Node cur = ans;

        while(l != null && m != null) {
            if (pos % 2 != 0) {

                cur = l.next;
                l.next = m;
                l = cur;

            } else {
                cur = m.next;
                m.next = l;
                m = cur;
            }
            pos++;

        }

        return ans;


    }
    public static void main(String[] args) {

        MergeTwoLinkedList l = new MergeTwoLinkedList();
        int []arr = {1,2,3,4};

        l.head = new Node(1);
       Node cur = l.head;
        for(int i = 1; i<arr.length; i++){
            cur.next =  new Node(arr[i]);
            cur = cur.next;
        }
        MergeTwoLinkedList m = new MergeTwoLinkedList();
        int []arr1 = {5,6,7,8,6,7,4};
        m.head = new Node(5);
        Node cur1 = m.head;
        for(int i = 1; i<arr1.length; i++) {
            cur1.next = new Node(arr1[i]);
            cur1 = cur1.next;
        }
        Node ans = solve(l.head,m.head);
        while (ans != null) {
            System.out.print(ans.data + ", ");
            ans = ans.next;
        }


    }
}
