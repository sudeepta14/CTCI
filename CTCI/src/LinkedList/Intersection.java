package LinkedList;

import java.util.HashSet;
import java.util.Set;

import LinkedList.Partition.Node;

public class Intersection {
	Intersection(){
		head=null;
	}
	static Node head;
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	public Node intersecting(Node l1, Node l2) {
		Set<Node> seen = new HashSet<>();
		Node pa = l1;
		while(pa != null) {
			seen.add(pa);
			pa = pa.next;
		}
		Node pb = l2;
		while(pb != null) {
			if(seen.contains(pb)) {
				return pb;
			}
		}
		return null;
	}
	void printList(Node head) {
		while(head != null ) {
			System.out.print(head.data + "-");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection list = new Intersection();

		Intersection list1 = new Intersection();
		
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.next.next = new Node(3);
		list1.head.next.next.next = new Node(4);
		list1.head.next.next.next.next = new Node(5);
		//list.printList(list1.head);
		
		Intersection list2 = new Intersection();
		
		list2.head = new Node(9);
		list2.head.next = new Node(8);
		list2.head.next.next = new Node(7);
		list2.head.next.next.next = new Node(6);
		list2.head.next.next.next.next = new Node(5);
		
		list.printList(list2.head);
		System.out.println("\n");
		list.printList(list1.head);
		
//		Node value = list.intersecting(list1.head, list2.head);
//		
//		System.out.println("\n");
//		list.printList(list2.head);
//		System.out.println("\n");
//		System.out.println(value.data);
		
		//System.out.println(value.data);
		
	}

}
