package co.edu.uelbosque.controller;

import java.util.Scanner;

import co.edu.uelbosque.model.Cola;
import co.edu.uelbosque.model.Pila;
/**
 * Clase Controller que controla la funcionalidad del programa.
 * @author Briannys Ahiram Paez Monserrate, Sergio Eduardo Peña Almeciga
 * @version 5.0
 * @serial 2021
 */
public class Controller {
	Scanner entrada = new Scanner(System.in);
	/**
	 * Constructor de la clase Controller
	 */
	public Controller() {
		funcionar();
	}
/**
 * Metodo de tipo void que permite funcionar a la clase Controller
 */
	
	public void funcionar() {		
		Pila pila = new Pila();
		Cola cola = new Cola();
		int n=-1;
		int eleccion1 = 0;
		do {
			System.out.println("Ingrese el tipo de dato\n1.Pila\n2.Cola\n3.Salir\n");
			eleccion1 = entrada.nextInt();
			if(eleccion1==1) {
				int decisionPila = 0;
				int sale = -1;
				do {
					decisionPila = menuPila();
					if(decisionPila==1) {
						System.out.println("Ingrese el numero para ingresar: ");
						int num = entrada.nextInt();
						pila.push(num);
					}else if(decisionPila==2) {
						pila.pop();
					}else if(decisionPila==3) {
						if(pila.getTop()!=-1) {
							System.out.println("El numero en el top es "+pila.getTop());
						}else {
							pila.getTop();
						}
					}else if(decisionPila==4) {
						System.out.println("El numero de elementos es "+pila.getNumberOfElements());
					}else if(decisionPila==5) {
						pila.imprimir();
					}else if(decisionPila==6) {
						sale++;
					}
					
				}while(decisionPila<1||decisionPila>6||sale==-1);
				
			}else if(eleccion1==2){
				int decisionCola= 0;
				int sale2 = -1;
				do {
					decisionCola = menuCola();
					if(decisionCola==1) {
						System.out.println("Ingrese el numero para ingresar: ");
						double num = entrada.nextDouble();
						cola.queue(num);
					}else if(decisionCola==2) {
						cola.dequeue();
					}else if(decisionCola==3) {
						System.out.println("El primer elemento es "+cola.getFirst());
					}else if(decisionCola==4) {
						System.out.println("El numero de elementos en la cola es "+cola.getNumberOfElements());
					}else if(decisionCola==5) {
						cola.imprimirCola();
					}else if(decisionCola==6) {
						sale2++;
					}
				}while(decisionCola<1||decisionCola>6||sale2==-1);
				
			}
		}while(eleccion1<1||eleccion1>3);
	}
/**
 * Metodo de tipo int que contiene el menu de la pila	
 * @return componente de tipo int
 */
	public int menuPila() {
		int n = 0;
		System.out.println("Menu pila\n1. Push\n2. Pop\n3. Get top\n4. Get number of elements\n5. Get Pila\n6. Exit");
		n = entrada.nextInt();
		return n;
	}
/**
 * Metodo de tipo int que contiene el menu de la cola	
 * @return componente de tipo int
 */
	public int menuCola() {
		int n = 0;
		System.out.println("Menu cola\n1. Queue\n2. Dequeue\n3. Get first\n4. Get number of elements\n5. Get Cola\n6. Exit");
		n = entrada.nextInt();
		return n;
	}
}
