package graph;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> implements IDataStructure<T> {
	
	private List<T> fifo;
	
	public Queue() {
		fifo = new ArrayList<T>();
	}

	public void add(T element) {
		fifo.add(element);
	}

	public T remove() {
		T element = fifo.get(0);
		fifo.remove(0);
		return element;
	}

	public boolean isEmpty() {
		return fifo.isEmpty();
	}

}
