package graph;

/**
 * Structure de données (ex: pile, file, etc.)
 * @param <T> Type des données que contient la structure.
 */
public interface IDataStructure<T> {

	/**
	 * Ajoute un élément à la structure
	 * @param element
	 */
	public void add(T element);
	/**
	 * Retire un élément de la structure.
	 * @return l'élément retiré.
	 */
	public T remove();
	/**
	 * @return true si la structure est vide. false sinon.
	 */
	public boolean isEmpty();

}
