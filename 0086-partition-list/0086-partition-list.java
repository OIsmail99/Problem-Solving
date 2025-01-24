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
    public ListNode partition(ListNode head, int x) {
        //two lists, one to hold the less than x, the other to hold the greater than or equal to x.
        ListNode lessList = new ListNode(0);
        ListNode greaterOrEqualList = new ListNode(0);
        ListNode current = head;
        
        //pointers to the two dummy lists.
        ListNode less = lessList;
        ListNode greaterOrEqual = greaterOrEqualList;
        while(current != null){
            if(current.val < x){
                less.next = current;
                less = less.next;
            }
            else if(current.val >= x){
                greaterOrEqual.next = current;
                greaterOrEqual = greaterOrEqual.next;
            }
            current = current.next;
        }
        less.next = greaterOrEqualList.next; //end of less list to point to beginning of the greater list.
greaterOrEqual.next = null; //terminate the greater list, otherwise it will be cyclic
        return lessList.next; //return the new list. 
    }
}