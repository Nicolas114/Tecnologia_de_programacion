package proyecto1;

import java.util.ArrayList;
import java.util.logging.*;

public class Graph<V,E> {

	private ArrayList<Node> nodos;
	private ArrayList<Edge> arcos;
	private static Logger logger;
	
	public Graph() {
		nodos = new ArrayList<>();
		arcos = new ArrayList<>();
		
		if (logger == null) {
			logger = Logger.getLogger(Graph.class.getName());

			Handler hnd = new ConsoleHandler();
			hnd.setLevel(Level.FINE);
			logger.addHandler(hnd);

			logger.setLevel(Level.WARNING);
			
			Logger rootLogger = logger.getParent();
			for (Handler h : rootLogger.getHandlers()) {
				h.setLevel(Level.OFF);
			}
		}
	}
	
	public void addNode(int node) {
		Node nuevo = new Node(node);
		if (!nodos.contains(nuevo)) {
			nodos.add(nuevo);
			logger.info("Nodo " + nuevo + " agregado correctamente.");
		}
		else {
			logger.warning("No se puede agregar el nodo " + nuevo + ". Ya existe el mismo elemento en el grafo.");
		}
	}
	
	public void addEdge(int node1, int node2) {
		Node nodo1 = new Node(node1);
		Node nodo2 = new Node(node2);
		Edge nuevo_arco = new Edge(nodo1, nodo2);
		Edge arco_invertido = new Edge(nodo2, nodo1);
		
		boolean contiene_nodo1 = this.nodos.contains(nodo1);
		boolean contiene_nodo2 = this.nodos.contains(nodo2);
		
		if (contiene_nodo1 && contiene_nodo2) {
			if (!(this.arcos.contains(nuevo_arco) && this.arcos.contains(arco_invertido))) {
				arcos.add(nuevo_arco);
				logger.info("El arco " + nuevo_arco + " fue agregado correctamente.");
			}
			else {
				logger.warning("No se puede agregar el arco " + nuevo_arco + ". "
						+ "O bien ya está en la lista o hay otro arco simétrico que une sus dos nodos.");
			}
		}
	}
	
}
