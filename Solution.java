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
        ListNode temp = new ListNode();
        ListNode merged = temp;
        ListNode listOne= list1;
        ListNode listTwo= list2;
  while(listOne!=null && listTwo!=null){

       if (listOne.val <= listTwo.val) {
            
                  merged.next= listOne;
              listOne = listOne.next;
            }else{
               merged.next= listTwo;
              listTwo = listTwo.next;
            }
            //After setting the lowest number as the next node we need to move it forward so its our current node
            merged = merged.next;        
        
  }
     while(listOne!=null){
        merged.next=listOne;
        listOne=listOne.next;
         merged=merged.next;
    }
    while(listTwo!=null){
        merged.next=listTwo;
        listTwo=listTwo.next;
        merged=merged.next;
    }
    return temp.next;
    }
}
