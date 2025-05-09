class SinglyLinkedListNode {
     int data;
     SinglyLinkedListNode next;
}

class InsertAtSpecificPosition{
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        int curr = 1;
        SinglyLinkedListNode currPointer = llist;

        while(curr < position){
            currPointer = currPointer.next;
            curr++;
        }

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode nextNode = currPointer.next;
        currPointer.next = newNode;
        newNode.next = nextNode;

        return llist;
    }
}