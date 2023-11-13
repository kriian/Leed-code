package start.task876;

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) System.out.println("Нода пустая");
        int lengthNode = lengthNode(head);
        int middleListNode = lengthNode / 2;
        for (int i = 0; i < middleListNode; i++) {
            head = head.next;
        }
        return head;
    }

    private int lengthNode(ListNode head) {
        if (head == null) return 0;
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


