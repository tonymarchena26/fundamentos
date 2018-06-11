/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);
        
        int numero_aleatorio = ran.nextInt(100);
        System.out.print("ingrese un número: ");
        int numero_digitado = scan.nextInt();
        
        while (numero_digitado != numero_aleatorio){
            if (numero_digitado > numero_aleatorio){
                System.out.println("Digita un número menor");
            }
            if (numero_digitado < numero_aleatorio){
                System.out.println("Digita un número mayor");
            }
            System.out.print("ingrese un número: ");
            numero_digitado = scan.nextInt();

            if (numero_digitado == numero_aleatorio){
                System.out.print("Felicidades!! El número que ingresaste es el correcto");
            }
        }
    }
}

    
        
    
    
