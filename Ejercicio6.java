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
/* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 
1.60 mts. y el promedio de estaturas en general.*/

public class Ejercicio6 {
    public static void main(String[] args){
        int cantidad, conteo;
        double estaturas,suma1, suma;
        System.out.println("Ingrese cantidad de personas");
        Scanner leer = new Scanner(System.in);
        cantidad = leer.nextInt();
        System.out.println("Ingrese sus estaturas");
        suma = 0;
        suma1 = 0;
        conteo = 0;
        for (int i = 1 ; i <= cantidad ; i++){
            estaturas = leer.nextDouble();
            if (estaturas < 1.6){
                suma1 = estaturas + suma1;
                conteo++;
            }
            suma = estaturas + suma;
        }
        System.out.println("El promedio de estaturas de " + cantidad + " de personas es igual a " +(suma/cantidad));
        System.out.println("El promedio de estatura por debajo de los 1,6 mts es igual a " +(suma1/conteo));
                }
}
