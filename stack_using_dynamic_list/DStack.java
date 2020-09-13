package stack_using_dynamic_list;

public class DStack {
	int capacity = 2;
	int stack[] = new int[capacity];
	int top=0;
	
	public void push(int data) {
		if(size()==capacity) 
			expand();
		stack[top]=data;
		top++;
	}
	
	private void expand() {
		int length=size();
		int new_stack[] = new int[capacity*2];
		System.arraycopy(stack, 0, new_stack, 0, length);
		stack = new_stack;
		capacity = capacity*2;
	}
	
	public void pop() {
		if(isEmpty())
			System.out.println("Stack is Empty");
		else {
			top--;
			stack[top]=0;
			shrink();
		}
	}
	
	private void shrink() {
		int length=size();
		if(length<=(capacity/4)) {
			capacity=capacity/2;
			int newStack[] = new int[capacity];
			System.arraycopy(stack, 0, newStack, 0, length);
			stack=newStack;
		}
	}
	
	public void show() {
		for(int i:stack)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public void peek() {
		System.out.println(stack[top-1]);
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return(top<=0);
	}
}