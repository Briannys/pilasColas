package co.edu.uelbosque.model;
/**
 * Clase Cola que permite mostrar una cola según un número de elementos.
 * @author Briannys Ahiram Paez Monserrate, Sergio Eduardo Peña Almeciga
 * @version 5.0
 * @serial 2021
 */
public class Cola implements IColaReales{
	private static final int maxSize = 100; // Atributo de tipo int que contiene el tamaño máximo de la cola.
	private int inicio; // Atributo de tipo int que contiene el inicio de la cola
	private int fin; // Atributo de tipo int que contiene el final de la cola.
	private double listaCola[]; // Atributo de tipo double que contiene los elementos en una lista de la cola.
	private int digitosAgregados; // Atributo de tipo int que contiene los digitos ingresados en la cola.
/**
 * Constructor de la clase Cola.
 */
	public Cola() {
		inicio = 0;
		fin = 0;
		digitosAgregados = 0;
		listaCola = new double[maxSize];
	}
/**
 * Metodo de tipo int que contiene el siguiente elemento en una cola.	
 * @return componente de tipo int.
 */
	private int siguiente() {
		return (inicio+digitosAgregados)%maxSize;
	}
/**
 * Metodo de tipo void que contiene la nueva posicion inicial de un elemento en la cola
 */
	private void nuevaPosInicial() {
		inicio = (inicio+1)%maxSize;
	}
/**
 * Metodo de tipo void que inserta un nuevo elemento en la cola.
 */
	@Override
	public void queue(double elemento) {
		if(!isFull()) {
			listaCola[siguiente()] =elemento;
			digitosAgregados++;
			if(fin<maxSize)
				this.fin++;
			else
				fin = 0;
		}else {
			System.out.println("La cola estÃ¡ llena");
		}
		
	}
/**
 * Metodo de tipo double que remueve el primer elemento de la cola.
 */
	@Override
	public double dequeue() {
		if(!isEmpty()) {
			double tm = listaCola[inicio];
			nuevaPosInicial();
			digitosAgregados--;
			return tm;
		}else {
			System.out.println("La cola esta vacia");
			return Integer.MIN_VALUE;
		}
		
	}
/**
 * Metodo de tipo void que permite imprimir la cola.
 */
	public void imprimirCola() {
		if(!isEmpty()) {
			for (int i = inicio; i < fin; i++) 
				System.out.println(listaCola[i]+" <- ");
			
			//for (int i = 0; i < fin+1&& !isEmpty(); i++) 
			//	System.out.println(listaCola[i]+" <- ");
			
		}else {
			System.out.println("Cola esta vacia");
		}
	}
/**
 * Método de tipo double que permite acceder al primer elemento de la cola.
 * @return componente de tipo double
 */
	@Override
	public double getFirst() {
		return listaCola[inicio];
	}
/**
 * Método de tipo int que permite obtener el numero de elementos de los digitos agregados.
 * @return componente de tipo int
 */
	@Override
	public int getNumberOfElements() {
		return digitosAgregados;
	}
/**
 * Método de tipo boolean que comprueba si esta vacia la cola.
 * @return componente de tipo boolean
 */
	@Override
	public boolean isEmpty() {
		if(digitosAgregados==0) {
			return true;
		}
		return false;
	}
/**
 * Método de tipo boolean que comprueba si la cola esta full.
 * @return componente de tipo boolean
 */
	@Override
	public boolean isFull() {
		if(digitosAgregados==maxSize) {
			return true;
		}
		return false;
	}
}
