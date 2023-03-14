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
/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de 
tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos 
que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente 
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.*/


public class Ejercicio5 {
    public static void main(String[] args) {
        String socio;
        double precio;
        System.out.println("Ingrese su clase de socio y el valor del costo del tratamiento");
        Scanner leer = new Scanner(System.in);
        socio = leer.nextLine();
        precio = leer.nextInt();
        switch (socio){
            case "A":
                System.out.println("Su costo real es de " + precio);
                precio = (precio * 0.5);
                System.out.println("Con su descuento por ser Socio tipo A quedaria en " + precio);
                break;
            case "B":
                System.out.println("Su costo real es de " + precio);
                precio = (precio * 0.65);
                System.out.println("Con su descuento por ser Socio tipo B quedaria en " + precio);
                break;
            case "C":
                System.out.println("Su costo real es de " + precio);
                System.out.println("Al ser socio tipo C no posee descuentos disponibles");
                break;
            default:
                System.out.println("El tipo de socio ingresado es incorrecto");
                
        }
    }
    
}
