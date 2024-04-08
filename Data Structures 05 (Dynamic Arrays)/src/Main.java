import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		
		// advantages:
		//	1. Random access of elements O(1)
		//	2. Good locality of reference and data cache utilization
		//	3. Easy to insert/delete at the end
		
		// disadvantages:
		//	1. wastes more memory
		//	2. Shifting elements is time consuming O(n)
		//	3. Expanding/Shrinking the array is time consuming O(n)
				
		
		//ArrayList<String> arrayList = new ArrayList<String>(); 
 
		DynamicArray dynamicArray = new DynamicArray(5);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		
		
		//dynamicArray.insert(0, "X");
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("C");
		
		System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("size : " + dynamicArray.size);
		System.out.println("capacity : " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
		
	}

}
