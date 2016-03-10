package graph;

/**
 * Structure de donn�es (ex: pile, file, etc.)
 * @param <T> Type des donn�es que contient la structure.
 */
public interface IDataStructure<T> {

	/**
	 * Ajoute un �l�ment � la structure
	 * @param element
	 */
	public void add(T element);
	/**
	 * Retire un �l�ment de la structure.
	 * @return l'�l�ment retir�.
	 */
	public T remove();
	/**
	 * @return true si la structure est vide. false sinon.
	 */
	public boolean isEmpty();

}
