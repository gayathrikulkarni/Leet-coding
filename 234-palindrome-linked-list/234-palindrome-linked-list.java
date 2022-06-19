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
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null ){
            return true;
        }
        
        ListNode middle = mid(head);
        ListNode temp = middle.next;
        middle.next = null;
        
        ListNode secondhalf = rev(temp);
        
        while(secondhalf != null){
            if(head.val != secondhalf.val){
                return false;
                
            }
            head = head.next;
            secondhalf = secondhalf.next;
        }
        return true;   
    }
    
    public ListNode mid(ListNode head){
        ListNode f = head.next;
        ListNode s = head;
        
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    
    public ListNode rev(ListNode mid){
        
        ListNode curr = mid;
        ListNode prev = null;
        
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}