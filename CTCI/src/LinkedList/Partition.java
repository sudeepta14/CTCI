package LinkedList;

import javax.xml.soap.Node;

public class Partition {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static Node partition(Node head, int x) {
		
		Node dummy1 = new Node(0);
		Node dummy2 = new Node(0);
		Node curr1 = dummy1;
		Node curr2 = dummy2;
		
		while(head != null) {
			if(head.data <x) {
				curr1.next= head;
				curr1 = head;
			}else {
				curr2.next = head;
				curr2 = head;
			}
			head = head.next;
		}
		curr2.next = null;
		curr1.next = dummy2.next;
		return dummy1.next;
	}
	
	void printList(Node head) {
		while(head != null ) {
			System.out.print(head.data + "-");
			head = head.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partition list = new Partition();
		list.head= new Node(1);
		list.head.next = new Node(4);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(2);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(2);
		//list.printList(list.head);
		Node why = list.partition(list.head, 3);
		list.printList(why);

	}

}
