package graph;

import java.util.Iterator;
import java.util.List;

public class UndirectedGraph implements IUndirectedGraph {
	
	private Graph graph;
	
	public UndirectedGraph() {
		graph = new Graph();
	}

	public void addNode(Node _node) {
		graph.addNode(_node);
	}

	public List<Node> getAllNodes() {
		return graph.getAllNodes();
	}

	public int getNbNodes() {
		return graph.getNbNodes();
	}

	public List<Node> getAdjNodes(Node _n) {
		return graph.getAdjNodes(_n);
	}

	public void addEdge(Node _node1, Node _node2) {
		graph.addArc(new Arc(_node1, _node2, null));
		graph.addArc(new Arc(_node2, _node1, null));
	}

	public boolean hasEdge(Node _node1, Node _node2) {
		return graph.hasArc(_node1, _node2);
	}

	public Iterator<Node> creerBFSIterator(Node n) {
		return graph.creerBFSIterator(n);
	}

	public Iterator<Node> creerDFSIterator(Node n) {
		return graph.creerDFSIterator(n);
	}

}
