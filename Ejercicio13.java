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
/* Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y 
termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: 
si se ingresa el número 3:
1
12
123
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        int n, i, j;
        System.out.println("Ingrese la altura de la escalera");
        Scanner leer = new Scanner(System.in);
        n = leer.nextInt() + 1;
        for ( i = 1 ; !(i == n) ; i++ ) {
            for ( j = 1; j <= i ; j++ ) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
