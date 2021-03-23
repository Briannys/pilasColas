package co.edu.uelbosque.model;
/**
 * Clase Pila que permite mostrar una pila de elementos.
 * @author Briannys Ahiram Paez Monserrate, Sergio Eduardo Peña Almeciga
 * @version 5.0
 * @serial 2021
 */
public class Pila implements IPilaEnteros{
	private static final int maxSize = 100;
	private int[] listaPila;
	private int cima;
/**
 * Constructor de la clase Pila
 */
	public Pila() {
		cima = -1;
		listaPila = new int[maxSize];
	}
/**
 * Metodo de tipo void que inserta un elemento a la pila.
 */
	@Override
	public void push(int elemento) {
		if(isFull()) {
			System.out.println("La pila estÃ¡ llena");
		}else {
			cima++;
			listaPila[cima] = elemento;
		}
		
	}
/**
 * Metodo de tipo int que remueve el elemento del top de la cima de la pila
 * @return componente de tipo int
 */
	@Override
	public int pop() {
		int aux = -1;
		if(isEmpty()) {
			System.out.println("La pila estÃ¡ vacia no se puede eliminar el elemento de la cima");
		}else {
			aux = listaPila[cima];
			cima--;
			System.out.println("Pop realizado con Ã©xito");
		}
		return aux;
	}
/**
 * Metodo de tipo int que retorna el top de la pila.
 * @return componente de tipo int.
 */
	@Override
	public int getTop() {
		if(isEmpty()) {
			System.out.println("La pila estÃ¡ vacia no se puede retornar nada");
			return -1;
		}else {
			return listaPila[cima];
		}
		
	}
/**
 * Método de tipo int que permite obtener el numero de elementos de los digitos agregados.
 * @return componente de tipo int
 */
	@Override
	public int getNumberOfElements() {
		return cima+1;
	}
/**
 * Método de tipo boolean que comprueba si la pila esta full.
 * @return componente de tipo boolean
 */
	@Override
	public boolean isFull() {
		if(cima==maxSize-1) {
			return true;
		}
		return false;
	}
/**
 * Método de tipo boolean que comprueba si esta vacia la pila.
 * @return componente de tipo boolean
 */
	@Override
	public boolean isEmpty() {
		if(cima==-1) {
			return true;
		}
		return false;
	}
/**
 * Metodo de tipo void que permite imprimir la pila.
 */
	public void imprimir() {
		for (int i = cima; i >=0; i--) {
			System.out.println("["+listaPila[i]+"]");
		}
	}
}
