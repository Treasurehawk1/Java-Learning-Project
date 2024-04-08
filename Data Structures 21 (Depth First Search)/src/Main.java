
public class Main {

	public static void main(String[] args) {
		// Depth First Search = a search algorithm for traversing a tree or graph data structure
		
		// 1. Pick a route
		// 2. Keep going until you reach a dead end, or a previously visited node
		// 3. Backtrack to Last node that has unvisited adjacent neighbors
		
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		

		graph.addEdge(0,1);
		graph.addEdge(1,2);
		graph.addEdge(1,4);
		graph.addEdge(2,3);
		graph.addEdge(2,4);
		graph.addEdge(4,0);
		graph.addEdge(4,2);
		
		graph.print();
		
		graph.depthFirstSearch(0);
		
	}

}
