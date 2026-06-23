package Linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
// Definition for singly-linked list.
// Used for local testing. On LeetCode, ListNode is provided automatically.


public class Q2_Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ln = new ListNode(0);
        ListNode curr = ln;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0 ){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1=l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2=l2.next;
            }
            curr.next = new ListNode(sum%10);
            carry = sum/10;

            curr = curr.next;
        }

        return ln.next;
    }
}
