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
/* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/


public class Ejercicio3 {
    public static void main(String[] args) {
            String letra; 
            System.out.println("Ingrese una letra");
            Scanner leer = new Scanner(System.in);
            letra = leer.nextLine();
            
            if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")) {
                System.out.println("La letra ingresada es una vocal");
            } else { System.out.println("Su letra no es una vocal boludo");
                    
                    }
                    }
                    }


