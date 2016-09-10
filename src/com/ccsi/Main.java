package com.ccsi;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    //Remove all elements from a linked list of integers that have value val.
    public static ListNode romoveElements(ListNode head,int val){
        if(head==null) return head;
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode curr=dummyHead;
        while (curr!=null){
            if(curr.next!=null&&curr.next.val==val)curr.next=curr.next.next;
            else {
                curr=curr.next;
            }
        }

    return dummyHead.next;
    }
}
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
