package proyecto1;

public class Edge {

	//los nodos que une el arco en cuestión
	private Integer nodo1, nodo2;
	
	public Edge(Integer nodo1, Integer nodo2) {
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
	}
	
	public String toString() {
		return "(" + nodo1.toString() + "-->" + nodo2.toString() + ")";
	}
	
	public Integer obtenerOrigen() {
		return nodo1;
	}
	
	public Integer obtenerDestino() {
		return nodo2;
	}
	
	public boolean equals(Edge arco) {
		return this.nodo1 == arco.obtenerOrigen() && this.nodo2 == arco.obtenerDestino();
	}
	
}
