package arrayList;
import java.util.ArrayList;		// Need to import this if working with Array Lists...
public class Array_List {
	public static void main(String[] args) {
		
		//int simple_array[] = new int[5];	// Fixed array of size 5.
		
		ArrayList<Integer> myList = new ArrayList<Integer>(5);		// 5 is the size of array we give initially this can 
										// be changed as new value is entered in the list.
		
		// ******* Adding new elements in array **********
		myList.add(1);
		myList.add(2);
		myList.add(22);
		myList.add(42);
		
		// ********** print array element by element **************
		System.out.println();
		System.out.println("**** print array element by element ****");
		
		for(Integer x : myList)
			System.out.println(x);
		
		// ********** print array **************
		System.out.println();
		System.out.println("**** print array ****");
		
		System.out.println(myList);
		
		// ********** size of array **************
		System.out.println();
		System.out.println("**** print size of array ****");
		
		System.out.println("Size = "+myList.size());			// Size here indicates the initial size of array list
										// i.e. the no of elements in the list.
	
		// ********** remove element from array at any index **************		
		System.out.println();
		System.out.println("**** remove element from array at any index ****");
		
		myList.remove(1);		// 1 here is the index of the element to be removed.
	
		System.out.println(myList);
		System.out.println("Size = "+myList.size());	
		
		
		// ********** changing an element in an array **************
		System.out.println();
		System.out.println("**** changing an element in array ****");
		
		myList.set(0, 100);		// 0 is the index of the value needs to be changed,
								// 100 is the new value to be inserted at 0th position.
		System.out.println("Size = "+myList.size());
		System.out.println(myList);
		
		
		// ********** clear the array (Deleting all elements) **************
		System.out.println();
		System.out.println("**** clear the array (Deleting all elements) ****");
		
		myList.clear();

		System.out.println("Size = "+myList.size());
		System.out.println(myList);
		
	}
}
