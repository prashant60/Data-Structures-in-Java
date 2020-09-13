package stack_using_dynamic_list;

public class Commands {

	public static void main(String[] args) {
		DStack stack = new DStack();
		stack.push(12);
		stack.push(2);
		stack.push(1);
		
		stack.show();
		
		stack.peek();
		
		stack.push(1342);
		stack.push(123);
		
		stack.peek();
		
		System.out.println(stack.isEmpty());
		
		stack.show();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.show();
		
		stack.pop();
		stack.pop();
		
		stack.show();
		
		stack.pop();
		
		System.out.println(stack.isEmpty());

	}

}
