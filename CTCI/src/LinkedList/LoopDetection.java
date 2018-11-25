package LinkedList;

import LinkedList.Partition.Node;

public class LoopDetection {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node loopy(Node head) {
		Node slow = head;
		Node fast = head; 
		
		// Find meeting point
		while (fast != null && fast.next != null) { 
			slow = slow.next; 
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}

		// Error check - there is no meeting point, and therefore no loop
		if (fast == null || fast.next == null) {
			return null;
		}

		/* Move slow to Head. Keep fast at Meeting Point. Each are k steps
		/* from the Loop Start. If they move at the same pace, they must
		 * meet at Loop Start. */
		slow = head; 
		while (slow != fast) { 
			slow = slow.next; 
			fast = fast.next; 
		}
		
		// Both now point to the start of the loop.
		return fast;
	}
	void printList(Node head) {
		while(head != null ) {
			System.out.print(head.data + "-");
			head = head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopDetection list = new LoopDetection();
		list.head = new Node(1);
		list.head.next = new Node(2);
		Node mid = new Node(7);
		list.head.next.next = mid;
		list.head.next.next.next = new Node(5);
		list.head.next.next.next.next = mid;
		//list.printList(list.head);
		Node value = list.loopy(list.head);
		System.out.println(value.data);
		
		
	}

}
