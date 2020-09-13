package stacks;

public class Commands {

	public static void main(String[] args) {
		Stack stack = new Stack();
			stack.push("Prashant");
			stack.push("Monika");
			stack.push("Urvashi");
			stack.peek();
			stack.show();
			stack.pop();
			stack.peek();
			stack.is_empty();
			stack.size();
			stack.pop();
			stack.show();
			stack.push("Monika");
			stack.push("Urvashi");
			stack.push("Varun");
			stack.push("Sparsh");
			stack.show();
			stack.size();
	}

}
