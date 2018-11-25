package LinkedList;

public class LinkedList {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void deleteMiddle(Node mid) {
		if(mid.next == null) {
			return;
		}
		Node curr = mid;
		curr.data = curr.next.data;
		curr.next = curr.next.next;
	}
	
	void  printKthtoLast(int k) {
		int listLength = 1;
		Node currentNode = head;
		
		while(currentNode.next != null) {
			currentNode = currentNode.next;
			listLength +=1;
		}
		
		if(k > listLength) {
			throw new IllegalArgumentException("k is larger than the length of the linkedlist");
		}
		int howFarToGo = listLength - k;
		currentNode = head;
		for(int i=0; i<howFarToGo; i++) {
			currentNode = currentNode.next;
		}
		printList(currentNode);
		
	}
	void remove_duplicates() {
		Node ptr1 = null, ptr2 = null, dup = null;
		ptr1 = head;
		
		while(ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			while(ptr2.next != null) {
				if(ptr1.data == ptr2.next.data) {
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				}else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}
	
	
	
	void printList(Node node) {
		while(node != null) {
			System.out.println(node.data + " ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.head=new Node(20);
		Node mid = new Node(7);
		list.head.next=mid;
		list.head.next.next=new Node(15);
		list.head.next.next.next=new Node(35);
		
		list.printList(head);
		
		list.printList(head);
		
		System.out.println("Sudeepta");
		System.out.println("Sudeepta");
		System.out.println("Sudeepta");
		int k = 2;
		list.deleteMiddle(mid);
		list.printList(head);
		//list.remove_duplicates();
		//list.printKthtoLast(k);
		

	}

}