/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtraG3;

import java.util.Scanner;

/**
 *
 * @author SFC
 */
/* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n 
números (n>0). El valor de n se solicitará al principio del programa y los números serán introducidos por 
el usuario. Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle 
“do - while”. */
public class Ejercicio7B {
    public static void main(String[] args) {
        int  conteo, m, maximo, minimo;
        double promedio, suma, n;
        System.out.println("Ingrese cantidad de números");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt();
        conteo = 1;
        suma = 0;
        System.out.println("Ingrese los números");
        maximo = 0;
        minimo = 1000000000;
        do {
            conteo++;
            m = leer.nextInt();
            if (m > maximo) {
                maximo = m;
            }
            if (m < minimo) {
                minimo = m;
            }
            suma = suma + m; 
        } while(n >= conteo);
        
        System.out.println("El número máximo ingresado es igual a " + maximo);
                System.out.println("El número mínimo ingresado es igual a " + minimo);
                promedio = suma/n;
                System.out.println("El promedio de los números ingresados es igual a " + promedio);
            
    }
}
