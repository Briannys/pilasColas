package co.edu.uelbosque.model;
/**
 * Interface de Cola que nos declara los métodos que se utilizarán en la clase Cola
 * @author Briannys Ahiram Paez Monserrate, Sergio Eduardo Peña Almeciga
 * @version 5.0
 * @serial 2021
 */
public interface IColaReales {
	/**
	 * Método de tipo void que inserta un elemento en la cola
	 * @param elemento corresponde al elemento a insertar
	 */
	public void queue(double elemento);
	/**
	 * Método de tipo double que elimina el primer elemento de la cola
	 */
	public double dequeue();
	/**
	 * Método de tipo double que nos retorna el primer elemento de la cola
	 * @return el primer elemento de la cola
	 */
	public double getFirst();
	/**
	 * Método de tipo int que nos retorna la cantidad de elementos en la cola
	 * @return la cantidad de elementos que contiene la cola
	 */
	public int getNumberOfElements();
	/**
	 * Método de tipo boolean que nos ayuda a saber si la cola está vacia
	 * @return true/false
	 */
	public boolean isEmpty();
	/**
	 * Método de tipo boolean que nos ayuda a saber si la cola está llena
	 * @return true/false
	 */
	public boolean isFull();
}


