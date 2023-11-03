/**Crear un programa en Javascript que realice lo siguiente:
3
0, 1, 1.
10
0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
Debe solicitar al usuario un número por prompt o por input y guardarlo.
Debe imprimir la serie de fibonacci dependiendo del número recibido, es decir, si el programa recibe un 8, debe mostrar 8 números de la serie de Fibonacci.
Debe imprimir el resultado por consola o por el DOM.
Debe ser capaz de identificar si el dato de entrada es de tipo number, en caso contrario debe mandar un mensaje de error y volver a solicitar el dato.
Prueba tu programa con las siguientes combinaciones para asegurarte que funcione correctamente:
Entrada: 
Salida: 
Entrada: 
Salida: 
Pruébalo con los números que se te ocurran. */

function calcularSerieFibonnacci() {
  let numero;
  do {
      numero = prompt("Introduce número para calcular la serie de Fibonacci");
      numero = parseFloat(numero);
      if (isNaN(numero)) {
          alert("Introduce un número válido");
      }
  } while (isNaN(numero));

  const resultado = serieFibonacci(numero);
  console.log("El cálculo de la serie de Fibonacci es: ", resultado);
}

function serieFibonacci(numero) {
  const serie = [];
  if (numero <= 0) {
      return serie;
  }
  if (numero >= 1) {
      serie.push(0);
  }
  if (numero >= 2) {
      serie.push(1);
  }
  for (let i = 2; i < numero; i++) {
      serie.push(serie[i - 1] + serie[i - 2]);
  }
  return serie;
}

calcularSerieFibonnacci();