package org.generation;

import java.util.Scanner;

public class Arrays8 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
        int[] primos = new int[10];
        int noPrimosCount = 0;
        int primosCount = 0;
		 for (int i = 0; i < 10; i++) {
	            System.out.print("Ingresa el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }
		// Recorrer el arreglo "numeros" y separar números primos y no primos
	        for (int i = 0; i < 10; i++) {
	            if (esPrimo(numeros[i])) {
	                primos[primosCount] = numeros[i];
	                primosCount++;
	            } else {
	                numeros[noPrimosCount] = numeros[i];
	                noPrimosCount++;
	            }
	            scanner.close();
	        }

	        // Mostrar el arreglo original
	        System.out.println("Arreglo Original:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }

	        // Mostrar el arreglo con números primos al principio
	        System.out.println("Arreglo con Números Primos al Principio:");
	        for (int i = 0; i < primosCount; i++) {
	            System.out.println("Índice " + i + ": " + primos[i]);
	        }
	        for (int i = 0; i < noPrimosCount; i++) {
	            System.out.println("Índice " + (i + primosCount) + ": " + numeros[i]);
	        }
	    }

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	      
	    }
	}
