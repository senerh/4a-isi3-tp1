package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GraphIterator implements Iterator<Node> {
	
	IGraph graph;
	IDataStructure<Node> dataStructure;
	List<Node> markedNodes;
	
	public GraphIterator(IGraph graph, Node summit, IDataStructure<Node> dataStructure) {
		this.graph = graph;
		this.dataStructure = dataStructure;
		this.dataStructure.add(summit);
		markedNodes = new ArrayList<Node>();
		markedNodes.add(summit);
	}

	public Node next() {
		Node currentNode = dataStructure.remove();
		List<Node> adjNodes = graph.getAdjNodes(currentNode);
		for (Node node : adjNodes) {
			if (!markedNodes.contains(node)) {
				dataStructure.add(node);
				markedNodes.add(node);
			}
		}
		return currentNode;
	}

	public boolean hasNext() {
		return !dataStructure.isEmpty();
	}

}
