/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.primo;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite un número para saber si es primo: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println("El número" + (isPrime ? " sí" : " no") + " es primo.");
    } 
    
}
