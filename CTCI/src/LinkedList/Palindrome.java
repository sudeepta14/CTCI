package LinkedList;

import java.util.Stack;

public class Palindrome {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static boolean isPalindrome(Node head) {
		Node fast = head;
		Node slow = head;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		while(fast != null && fast.next!= null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast != null) {
			slow = slow.next;
		}
		
		while(slow != null) {
			int top = stack.pop().intValue();
			if(top != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome list = new Palindrome();
		list.head = new Node(7);
		list.head.next = new Node(1);
		list.head.next.next = new Node(6);
		list.head.next.next.next = new Node(6);
		list.head.next.next.next.next = new Node(1);
		list.head.next.next.next.next.next = new Node(7);
		System.out.println(list.isPalindrome(list.head));
		
	}

}