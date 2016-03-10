package graph;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> implements IDataStructure<T> {

	private List<T> lifo;

	public Stack() {
		lifo = new ArrayList<T>();
	}

	public void add(T element) {
		lifo.add(element);
	}

	public T remove() {
		T element = lifo.get(lifo.size() - 1);
		lifo.remove(lifo.size() - 1);
		return element;
	}

	public boolean isEmpty() {
		return lifo.isEmpty();
	}
}
