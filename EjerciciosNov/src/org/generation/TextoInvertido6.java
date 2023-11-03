package org.generation;

import java.util.Scanner;

public class TextoInvertido6 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingrese una palabra:");
	        String palabra = scanner.nextLine();
	        
	        String palabraInversa = "";

	        for (int i = palabra.length() - 1; i >= 0; i--) {
				palabraInversa += palabra.charAt(i);
	        }
	        System.out.println("La palabra a la inversa es: " + palabraInversa);
				
	        scanner.close();
	    }
}
