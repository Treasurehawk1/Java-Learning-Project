import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		
		// Queue = FIFO data structure. First-In First-Out (Ex. A line of people)
		//		   A collection designed for holding elements prior to processing
		//		   Linear data structure
		//
		//		   add    = enqueue, offer()
		//		   remove = dequeue, poll()

		// Where are queues useful?
		// 1. Keyboard Buffer (letters should appear on the screen in the order they are pressed
		// 2. Printer queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
		
		
		
		Queue<String> queue = new LinkedList<String>(); // cannot be instantiated as a queue because queue is an interface, thus LinkedList is used since it implements Queue
		
		
		System.out.println(queue.isEmpty());
		
		queue.offer("K-Dog");
		queue.offer("C-Dog");
		queue.offer("S-Dog");
		queue.offer("H-Dog");
		
		// extends the container class so it has the 3 following functions available to it
		
		System.out.println(queue.size());
		
		System.out.println(queue.contains("S-Dog"));
		
		System.out.println(queue.peek());
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		
		System.out.println(queue);
	}

}
