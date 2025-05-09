class SinglyLinkedListNode {
     int data;
     SinglyLinkedListNode next;
}


public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
    // Write your code here
    if(head == null || head.next == null) return head;

    SinglyLinkedListNode secondHead = reverse(head.next);

    head.next.next = head;
    head.next = null;

    return secondHead;
}