package org.generation;

import java.util.HashMap;
import java.util.Scanner;

public class Colecciones9 {
	
    public static void main(String[] args) {
    	
        HashMap<String, String> dictionary = new HashMap<String, String>();
        
        dictionary.put("palabra", "word");
        dictionary.put("dulce", "candy");
        dictionary.put("familia", "family");
        dictionary.put("musica", "music");
        dictionary.put("computadora", "computer");
        dictionary.put("amor", "love");
        dictionary.put("pelicula", "movie");
        dictionary.put("helado", "ice cream");
        dictionary.put("lentes", "glasses");
        dictionary.put("carro", "car");
        dictionary.put("cuaderno", "notebook");
        dictionary.put("anillo", "ring");
        dictionary.put("celular", "cell phone");
        dictionary.put("oso", "bear");
        dictionary.put("cabello", "hair");
        dictionary.put("gorra", "cap");
        dictionary.put("espejo", "mirror");
        dictionary.put("ventana", "window");
        dictionary.put("hielo", "ice");
        dictionary.put("chamarra", "jacket");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra en español: ");
        
        String palabraEspañol = scanner.nextLine();

        String traduccion = dictionary.get(palabraEspañol);

        if (dictionary.containsKey(palabraEspañol)) {
            System.out.println("La traducción al inglés de " + palabraEspañol + " es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
        
        scanner.close();
    }
}