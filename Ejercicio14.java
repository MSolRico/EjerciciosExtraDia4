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
/* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para 
averiguar la media de edad de los hijos de todas las familias. */
public class Ejercicio14 {
 public static void main(String[] args) {
     int n, m, o;
     double suma, suma2;
     System.out.println("Cantidad de familias:");
     Scanner leer = new Scanner(System.in);
     n = leer.nextInt();
     suma = 0;
     suma2 = 0;
     for (int i = 1; i <= n ; i++) {
         System.out.println("Ingrese la cantidad de hijos:");
         m = leer.nextInt();
         suma2 = suma2 + m;
         for (int j = 1; j <= m ; j++) {
             System.out.println("Ingrese la edad de sus hijos:");
             o = leer.nextInt();
             suma = suma + o;
         }
     }
     System.out.println("La media de edad de los hijos de todas las familias es de " + (suma/suma2)+ " años.");
 }   
}
