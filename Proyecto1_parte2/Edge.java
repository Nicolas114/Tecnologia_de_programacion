package proyecto1;

public class Edge {

	//los nodos que une el arco en cuestión
	private Node nodo1, nodo2;
	
	public Edge(Node nodo1, Node nodo2) {
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
	}
	
	public String toString() {
		return "(" + nodo1.toString() + ", " + nodo2.toString() + ")";
	}
	
	public Node obtenerOrigen() {
		return nodo1;
	}
	
	public Node obtenerDestino() {
		return nodo2;
	}
	
	public boolean equals(Edge arco) {
		return nodo1.hashCode() == arco.obtenerOrigen().hashCode() 
				&& nodo2.hashCode() == arco.obtenerDestino().hashCode();
	}
	
}
