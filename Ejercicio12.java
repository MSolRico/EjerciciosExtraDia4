/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtraG3;

/**
 *
 * @author SFC
 */
/* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. */
public class Ejercicio12 {
    public static void main(String[] args) {
        int digitos;
        for (int i=1 ; i <= 9 ; i++) { 
            for (int j = 1 ; j <= 9 ; j++) {
                for (int k = 1; k <= 9 ; k++) {
                    String output = String.format("%d-%d-%d",i,j,k);
                    if (output.contains("3")) {
                    output = output.replace("3", "E");
            }
            System.out.println(output);
                }
            }
        }
           
    }
}
