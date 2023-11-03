package org.generation;

import java.util.Scanner;

public class MinutosRestantes7 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un día de la semana (lunes a domingo):");
	        String dia = scanner.nextLine().toLowerCase(); 

	        int seleccionDia = 0;

	        switch (dia) {
	            case "lunes":
	                seleccionDia = 0;
	                break;
	            case "martes":
	                seleccionDia = 1;
	                break;
	            case "miercoles":
	                seleccionDia = 2;
	                break;
	            case "jueves":
	                seleccionDia = 3;
	                break;
	            case "viernes":
	                seleccionDia = 4;
	                break;
	            case "sabado":
	                seleccionDia = 5;
	                break;
	            case "domingo":
	                seleccionDia = 6;
	                break;
	            default:
	                System.out.println("El día introducido no es correcto.");
	                scanner.close();
	                return; // 
	        }

	        System.out.println("A continuación introduzca la hora (hora y minutos)");
	        System.out.print("Hora: ");
	        int horas = scanner.nextInt();
	        System.out.print("Minutos: ");
	        int minutos = scanner.nextInt();

	        int minutosTotales = (4 * 24 * 60) + (15 * 60);
	        int minutosActuales = (seleccionDia * 24 * 60) + (horas * 60) + minutos;

	        if (minutosActuales > minutosTotales) {
	            System.out.println("¡Ya es fin de semana!");
	        } else {
	            System.out.println("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana.");
	        }

	        scanner.close();
	    }
	}

