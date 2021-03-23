package co.edu.uelbosque.model;
/**
 * Interface de IPilaEnteros que permite utilizar los metodos creados en esta interfaz
 * @author Briannys Ahiram Paez Monserrate, Sergio Eduardo Peña Almeciga
 * @version 5.0
 * @serial 2021
 */
public interface IPilaEnteros {
/**
 * Metodo de tipo void que permite insertar un nuevo elemento en la pila.
 * @param elemento parametro de tipo int que contiene al elemento
 */
	public void push(int elemento);
/**
 * Metodo de tipo int que permite sacar un elemento de la pila
 * @return comoponente de tipo int
 */
	public int pop();
/**
 * Metodo de tipo int que permite obtener el top de la pila
 * @return comoponente de tipo int
 */
	public int getTop();
/**
 * Metodo de tipo int que permite obtener un numero de elementos
 * @return componente de tipo int
 */
	public int getNumberOfElements();
/**
 * Metodo de tipo boolean que comprueba si la pila esta full.
 * @return componente de tipo boolean 
 */
	public boolean isFull();
/**
 * Metodo de tipo boolean que comprueba si la pila esta vacia.
 * @return componente de tipo boolean.
 */
	public boolean isEmpty();
}
