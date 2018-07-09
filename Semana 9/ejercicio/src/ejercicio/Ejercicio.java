/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author ulacit
 */
public class Ejercicio {

    public static void main(String[] args) {
        int [][] matriz = {
            {1, 2, 3},
            {2, 1, 3},
            {3, 2, 1},
        };
        if(matriz[0][0]==matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[2][2]==matriz[0][0] ){
                 System.out.println("\nLa matriz es reflexiva");
            }
        else
            System.out.println("Ejercicio incorrecto");

    }
    
}
