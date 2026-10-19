
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
       ListNode prev = head; 
       ListNode temp = prev.next;
       while(temp != null){
        if(prev.val == temp.val){
            temp = temp.next;
            continue;
        }
        prev.next = temp;
        prev = temp ;
        temp = temp.next;
       } 
          prev.next = null;
          return head;
    }
}