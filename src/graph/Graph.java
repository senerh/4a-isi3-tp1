package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Graph implements IDirectedGraph {
	
	private List<Node> listNodes;
	private List<Arc> listArcs;
	
	public Graph() {
		listNodes = new ArrayList<Node>();
		listArcs = new ArrayList<Arc>();
	}

	public void addNode(Node _node) {
		listNodes.add(_node);
	}

	public List<Node> getAllNodes() {
		return listNodes;
	}

	public int getNbNodes() {
		return listNodes.size();
	}

	public List<Node> getAdjNodes(Node _n) {
		List<Node> adjNodes = new ArrayList<Node>();
		for (Arc arc : listArcs) {
			if (arc.getSource().equals(_n)) {
				adjNodes.add(arc.getDestination());
			}
		}
		return adjNodes;
	}

	public boolean hasArc(Node _n1, Node _n2) {
		for (Arc arc : listArcs) {
			if (arc.getSource().equals(_n1) && arc.getDestination().equals(_n2)) {
				return true;
			}
		}
		return false;
	}

	public void addArc(Arc _edge) {
		listArcs.add(_edge);
	}

	public List<Arc> getArc(Node _n) {
		List<Arc> arcs = new ArrayList<Arc>();
		for (Arc arc : listArcs) {
			if (arc.getSource().equals(_n)) {
				arcs.add(arc);
			}
		}
		return arcs;
	}

	public Iterator<Node> creerBFSIterator(Node n) {
		return new GraphIterator(this, n, new Queue<Node>());
	}

	public Iterator<Node> creerDFSIterator(Node n) {
		return new GraphIterator(this, n, new Stack<Node>());
	}

}
