package oneWeekPreperationKit;

import util.SinglyLinkedListNode;

public class MergeTwoSortedLinkedLists {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode newHead = new SinglyLinkedListNode(0);
        SinglyLinkedListNode newTail = newHead;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                newTail.next = head1;
                head1 = head1.next;
            } else {
                newTail.next = head2;
                head2 = head2.next;
            }
            newTail = newTail.next;
        }

        if (head1 != null) {
            newTail.next = head1;
        } else {
            newTail.next = head2;
        }

        return newHead.next;

    }
}
