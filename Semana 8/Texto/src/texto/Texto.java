/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

/**
 *
 * @author ulacit
 */
public class Texto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
        palabra = "Texto ejemplo";
        
        for (int x=palabra.length()-1;x>=0;x--){
           String palabraInvertida;
            palabraInvertida = palabraInvertida + palabra.charAt(x);
            System.out.println(palabraInvertida);
        }
    }
    
}
