package proyecto1;

public class Main{

	public static void main(String args[]){
		Graph grafo1 = new Graph();
		
		grafo1.addNode(1);
		grafo1.addNode(2);
		grafo1.addNode(3);
		grafo1.addNode(4);
		grafo1.addNode(5);
		grafo1.addNode(6);
		grafo1.addNode(7);
		grafo1.addNode(8);
		grafo1.addNode(9);
		grafo1.addNode(13);
		
		
		grafo1.addEdge(1, 2);
		grafo1.addEdge(1, 3);
		grafo1.addEdge(2, 1);
		grafo1.addEdge(5, 9);
		
		grafo1.removeEdge(1, 2);
		grafo1.removeNode(1);
		grafo1.removeNode(9);
		
		
		System.out.println(grafo1.toString());
		
		
		
	}
}