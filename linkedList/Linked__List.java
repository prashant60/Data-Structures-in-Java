package linkedList;

public class Linked__List {
	Node head;
	
	public void insert_at_end(String data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
		}
		else {
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=node;
		}
	}
	
	public void insert_at_begin(String data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(head==null) {
			head=node;
		}
		else {
			node.next=head;
			head=node;
		}
	}
	
	public void insert_at_index(int pos, String data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		int count=0;
		
		if(pos<0) {
			System.out.println("Invalid Index Value");
		}
		
		else if(head==null && pos>0) {
			System.out.println("Value Index out of Range");
		}
		
		else if(head!=null && pos==0) {
			node.next=head;
			head=node;
		}
		
		else {
			Node curr = head;
			while(curr.next!=null && count!=pos-1) {
				curr=curr.next;
				count+=1;	
			}
			if(count==pos-1) {
				node.next=curr.next;
				curr.next=node;
			}
			else {
				System.out.println("List Index out of Range");
			}
		}
	}
	
	
	public void delete(int pos) {
		
		if(pos==0) {
			head=head.next;
		}
		
		else {
			Node curr=head;
			for(int i=0;i<pos-1;i++) {
				curr=curr.next;
			}
			curr.next=curr.next.next;
		}
	}
	
	
	
	public void print() {
		if(head==null)
			System.out.println("No data found");
		else {
			Node curr=head;
			while(curr.next!=null) {
				System.out.print(curr.data+" ---> ");
				curr=curr.next;
			}
			System.out.println(curr.data);
		}
	}
}
