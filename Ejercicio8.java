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
/* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura 
y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. Al 
igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
public class Ejercicio8 {
 public static void main(String[] args) {
     int n, pares, impares;
     double i;
     System.out.println("Ingrese numeros enteros");
     Scanner leer = new Scanner(System.in);
     pares = 0;
     impares = 0;
     n = leer.nextInt();
        for (i = 1; !(n%5 == 0) ; i++) {
            if (n>0){ 
         if ( n%2 == 0){
             pares++;
         } else {
             impares++;
         }   
     } 
     n = leer.nextInt();
     }
     System.out.println("Cantidad de numeros leidos: " +i);
     System.out.println("Cantidad de numeros pares ingresados: " + pares);
     System.out.println("Cantidad de numeros impares ingresados: " + impares);
 }   
}
