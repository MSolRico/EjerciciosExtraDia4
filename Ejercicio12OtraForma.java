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
public class Ejercicio12OtraForma {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String valor = Integer.toString(i) + "-" + Integer.toString(j) + "-" + Integer.toString(k);
                    if (valor.contains("3")) {
                        valor = valor.replace("3", "E");
                    }
                    System.out.println(valor);
                }
            }
        }
    }
}
