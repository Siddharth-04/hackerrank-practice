class SinglyLinkedListNode {
     int data;
     SinglyLinkedListNode next;
}

class MergeTwoSortedLinkedList{
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        if(head1 == null) return head2;
        if(head2 == null) return head1;

        SinglyLinkedListNode node1 = head1;
        SinglyLinkedListNode node2 = head2;

        SinglyLinkedListNode ll = new SinglyLinkedListNode(0);
        SinglyLinkedListNode temp = ll;

        while(node1 != null && node2 != null){
            if((node1.data) > (node2.data)){
                SinglyLinkedListNode newNode = new SinglyLinkedListNode(node2.data);
                temp.next = newNode;
                node2 = node2.next;
                temp = temp.next;
            }

            else if(node2.data > node1.data){
                SinglyLinkedListNode newNode = new SinglyLinkedListNode(node1.data);
                temp.next = newNode;
                node1 = node1.next;
                temp = temp.next;
            }

            else{
                SinglyLinkedListNode newNode = new SinglyLinkedListNode(node1.data);
                temp.next = newNode;
                temp = temp.next;

                SinglyLinkedListNode newNode2 = new SinglyLinkedListNode(node1.data);
                temp.next = newNode2;
                temp = temp.next;

                node1 = node1.next;
                node2 = node2.next;
            }
        }

        while(node1 != null){
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(node1.data);
            temp.next = newNode;
            temp = temp.next;
            node1 = node1.next;
        }

        while(node2 != null){
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(node2.data);
            temp.next = newNode;
            temp = temp.next;
            node2 = node2.next;
        }

        return ll.next;
    }

}
