package proyecto1;

public class Node {

	private int valor;
	
	public Node(int valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "" + valor;
	}
	
	public int obtenerValor() {
		return valor;
	}
	
	public boolean equals(Node nodo) {
		return this.hashCode() == nodo.hashCode();
	}
}
