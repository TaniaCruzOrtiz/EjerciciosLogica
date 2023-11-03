package org.generation;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario10 {

    public static void main(String[] args) {
        // añadimos palabras
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("fotografía", "photo");
        diccionario.put("serpiente", "snake");
        diccionario.put("pájaro", "bird");
        diccionario.put("árbol", "tree");
        diccionario.put("ojo", "eye");
        diccionario.put("lluvia", "rain");
        diccionario.put("corazon", "heart");
        diccionario.put("sol", "sun");
        diccionario.put("maestro", "teacher");
        diccionario.put("tijeras", "scissors");
        diccionario.put("leon", "lion");
        diccionario.put("recámara", "bedroom");
        diccionario.put("cuerda", "rop");
        diccionario.put("gimnasio", "gym");
        diccionario.put("ejercicio", "exercise");
        diccionario.put("limite", "limit");
        diccionario.put("barco", "ship");
        diccionario.put("abeja", "bee");
        diccionario.put("aguila", "eagle");
        diccionario.put("motocicleta", "motorcycle");

        // Genera un array con 5 palabras aleatorias del diccionario en español.
        String[] palabrasAleatorias = generarPalabrasAleatorias(diccionario, 5);

        // Cuenta las respuestas correctas e incorrectas del usuario.
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        // entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, por favor escribe la traducción al inglés de las siguientes palabras en español:");

        for (String palabraEspanol : palabrasAleatorias) {
            System.out.print("Traducción de '" + palabraEspanol + "': ");
            String respuestaUsuario = scanner.nextLine();

            // Comprueba si la respuesta del usuario es correcta.
            String traduccionCorrecta = diccionario.get(palabraEspanol);
            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es '" + traduccionCorrecta + "'.");
                respuestasIncorrectas++;
            }
        }

        System.out.println("!Excelente trabajo¡");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        // Cierra el scanner.
        scanner.close();
    }

    // Método para generar palabras aleatorias del diccionario en español.
    private static String[] generarPalabrasAleatorias(HashMap<String, String> diccionario, int cantidad) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasAleatorias = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            palabrasAleatorias[i] = palabras[random.nextInt(palabras.length)];
        }

        return palabrasAleatorias;
    }
}