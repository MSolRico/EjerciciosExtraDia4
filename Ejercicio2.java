package Guia3.EjercicioExtras;


/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
 * diferente a cada una. A continuación, realizar las instrucciones necesarias 
 * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
 *  Mostrar los valores iniciales y los valores finales de cada variable. 
 *  Utilizar sólo una variable auxiliar.*/

public class Ejercicio1 {
	
	
	public static void main(String[] args) {
		
		int A,B,C,D,aux;;
		aux = 0;
		A = 5;
		B = 89;
		C = 32;
		D = 23;
		System.out.println("Valores Iniciales: ");
		System.out.println("A "+A);
		System.out.println("B "+B);
		System.out.println("C "+C);
		System.out.println("D "+D);
		
		aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;	
		System.out.println("Valores modificados: ");
		System.out.println("A "+A);
		System.out.println("B "+B);
		System.out.println("C "+C);
		System.out.println("D "+D);
		
		
	}

}
