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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        
        
        ListNode node = head;
        while(node != null ){
            if(node.val == val){
                dummy.next = dummy.next.next;
                node = node.next;
            }
            else if(node.next != null && node.next.val == val){
                node.next = node.next.next;
                
            }
            else{
            node = node.next;
        }
        }
        return dummy.next;
        
    }
    
}