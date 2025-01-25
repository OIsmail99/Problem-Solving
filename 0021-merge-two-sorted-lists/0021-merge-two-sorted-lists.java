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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode(0);
        ListNode left = list1;
        ListNode right = list2;
        ListNode index = newList;
        while(left != null && right != null){
            if(left.val <= right.val){
                index.next = left;
                ListNode temp = left.next;
                left.next = null;
                left = temp;    
                // ListNode node = new ListNode(left.val);
                // index.next = node;
                // index = index.next;
            }
            else{
                index.next = right;
                ListNode temp = right.next;
                right.next = null;
                right = temp; 
            }
           index = index.next;
        }
        while(left != null){
                index.next = left;
                ListNode temp = left.next;
                left.next = null;
                left = temp;
                index = index.next;   
        }
        while(right != null){
                index.next = right;
                ListNode temp = right.next;
                right.next = null;
                right = temp;
                index = index.next;
        }
        return newList.next;
    }
}