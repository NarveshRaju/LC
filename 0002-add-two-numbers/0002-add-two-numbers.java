class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode();
        ListNode dummy = new ListNode(-1);
        int sum;
        int carry = 0;
        curr = dummy;
        while(l1 != null || l2 != null){
            sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            sum = sum%10;
            ListNode newNode = new ListNode(sum);
            curr.next = newNode;
            curr = curr.next; 
        }
        if(carry != 0){
            ListNode newN =new ListNode(carry);
            curr.next = newN;
            curr = curr.next; 
        }
        return dummy.next;
    }

}