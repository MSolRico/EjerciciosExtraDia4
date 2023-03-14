/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtraG3;

import java.util.Scanner;

/**
 *
 */
/* Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de 
dígitos matemáticamente utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int num,aux,digitos;
        System.out.println("Introduzca un numero");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        aux = num;
        digitos=1;
        while (aux<=num && aux>1){
            aux = aux/10;
            digitos++;
        }        
        System.out.println("Sus digitos son igual a "+digitos);
    }
}
