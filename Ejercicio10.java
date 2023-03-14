package EjerciciosExtraG3;

import java.util.Scanner;

/*
 * Realice un programa para que el usuario 
 * adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
 * El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea 
 * incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio 
 * investigue como utilizar la función Math.random() de Java.*/



public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		int numero,random1,random2,result;
		Scanner sc = new Scanner(System.in);
		random1 = (int) (Math.random()*10);
		random2 = (int) (Math.random()*10);

		result = random1*random2;
		do {
			System.out.println("Ingrese un numero");
			numero = sc.nextInt();
		
			if(numero != result) {
				System.out.println("MAL");
			}
			
		}while(numero != result);
		
		System.out.println("CORRECTO!");
		
	}

}
