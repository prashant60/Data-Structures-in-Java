package linkedList;

public class Commands {
	public static void main(String[] args) {
		
		Linked__List linked = new Linked__List();
		linked.insert_at_end("Prashant");
		linked.insert_at_end("Monika");
		linked.insert_at_end("Urvashi");
		linked.insert_at_end("Varun");
		
		linked.insert_at_begin("Naresh");
		
		linked.insert_at_index(2, "Goel");
		linked.insert_at_index(0, "Hemlata");

		linked.delete(3);
		
		linked.print();
	}
}
