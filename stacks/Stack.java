package stacks;

class Node{
	String data;
	Node next;
}


public class Stack {
	Node head;
	int top=0;
	
	public void push(String data) {
		Node node=new Node();
		node.data=data;
		if(head==null) {
			head=node;
			top++;
		}
		else {
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=node;
			top++;
		}
	}
	
	public void pop() {
		if(top==0) {
			System.out.println("Empty stack");
		}
		else {
			Node curr=head;
			while(curr.next.next!=null) {
				curr=curr.next;
			}
			curr.next=null;
			top--;
		}
	}
	
	public void peek() {
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	
	public void size() {
		System.out.println(top);
	}
	
	public void is_empty() {
		if(top==0) System.out.println("True");
		else System.out.println("False");
	}
	
	public void show() {
		Node curr=head;
		while(curr.next!=null) {
			System.out.print(curr.data + " ");
			curr=curr.next;
		}
		System.out.println(curr.data);
	}
	
}
