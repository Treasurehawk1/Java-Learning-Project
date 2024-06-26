import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// LinkedList = stores Nodes in 2 parts (data + address)
		// 				Nodes are in non-consecutive memory locations
		//				Elements are linked using pointers
		
		//					Singly Linked List
		//		Node 				Node			Node
		// [data | address]	[data | address] [data | address]

		// 					Doubly Linked List
		//				Node 						Node					Node
		// 	[address | data | address]	[address | data | address] [address | data | address]
		
		//	advantages? 
		//  1. Dynamic Data Structure (allocates needed memory while running)
		//  2. Insertion and Deletion of Nodes is easy. O(1)
		//  3. No/Low memory waste
		
		//  disadvantages?
		//  1. Greater Memory usage (additional power)
		//  2. No Random access of elements (no index [i]
		//  3. Accessing/searching elements is more time consuming. O(n)
		
		//  uses?
		//  1. implement Stacks/Queues
		//  2. GPS navigation
		//  3. music playlist
		
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		/*
		 * linkedList.push("A");
		 * 
		 * linkedList.push("B");
		 * 
		 * linkedList.push("C");
		 * 
		 * linkedList.push("D");
		 * 
		 * linkedList.push("F");
		 * 
		 * linkedList.pop();
		 */
		
		// linkedList as a Queue
		linkedList.offer("A");

		linkedList.offer("B");

		linkedList.offer("C");

		linkedList.offer("D");

		linkedList.offer("F");
		
		//linkedList.pop();
		
		linkedList.add(4, "E");
		linkedList.remove("E");
		
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		String first = linkedList.removeFirst();
		String last = linkedList.removeLast();
		
		System.out.println(linkedList);
		
	}

}
