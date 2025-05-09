class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;
}

static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    if(head == null){
        return new SinglyLinkedListNode(data);
    }

    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    SinglyLinkedListNode curr = head;

    while(curr.next != null){
        System.out.print(curr.data);
        curr = curr.next;
    }

    curr.next = newNode;
    return head;
}