/*Crear un programa en Javascript que realice lo siguiente:
Debe solicitar al usuario 3 números por prompt y guardarlos en sus respectivas variables.
Debe analizar los números, identificar cual es el número mayor, el número del centro y el número menor.
Debe imprimir los números por consola o por el DOM ordenados de mayor a menor, y de menor a mayor.
Debe ser capaz de identificar si los números son iguales e imprimir un mensaje por consola o por el DOM diciendo que los números son iguales.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
Entradas: 
4, 4, 2.
Salida:
4, 4, 2.
2, 4, 4.
Entradas: 
4, 2, 4.
Salida:
4, 4, 2.
2, 4, 4.
Entradas: 
2, 4, 4.
Salida:
4, 4, 2.
2, 4, 4.
Pruébalo con las combinaciones de números que se te ocurran*/

const numeros = document.getElementsByClassName("numeros")[0];
const iguales = document.getElementsByClassName("iguales")[0];
const ordenMayor = document.getElementsByClassName("mayor")[0];
const ordenMenor = document.getElementsByClassName("menor")[0];

let numero1 = parseFloat(prompt("Ingrese el primer número")); // Los prompts entregan cadena de texto, por lo que se tienen que convertir a int 
let numero2 = parseFloat(prompt("Ingrese el segundo número"));
let numero3 = parseFloat(prompt("Ingrese el tercer número"));
let menor;
let medio;
let mayor;
numeros.textContent = `Los números ingresados son: ${numero1}, ${numero2}, ${numero3}`;

// Encontrar el mayor, el del centro y el menor
if (numero1 >= numero2 && numero1 >= numero3) {
    mayor = numero1;
    if (numero2 >= numero3) {
        medio = numero2;
        menor = numero3;
    } else {
        medio = numero3;
        menor = numero2;
    }
} else if (numero2 >= numero1 && numero2 >= numero3) {
    mayor = numero2;
    if (numero1 >= numero3) {
        medio = numero1;
        menor = numero3;
    } else {
        medio = numero3;
        menor = numero1;
    } 
} else {
    mayor = numero3;
    if (numero1 >= numero2) {
        medio = numero1;
        menor = numero2;
    } else {
        medio = numero2;
        menor = numero1;
    }
}

ordenMayor.textContent = `De mayor a menor: ${mayor}, ${medio}, ${menor}`;
ordenMenor.textContent = `De menor a mayor: ${menor}, ${medio}, ${mayor}`;

// Comprobar si los números son iguales
if (numero1 === numero2 && numero2 === numero3) {
    iguales.textContent = `Los números ingresados son iguales: ${numero1}`;
}