
package aceptaelreto172;

import java.util.Scanner;

/**
 *
 * @author Montero
 */
public class AceptaElReto172 {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        //System.out.println ("Dame el numero de sillas"); //Pedimos el numero al usuario
        int numeroSillas = sc.nextInt(); // Pedimos el numero por pantalla para saber si tenemos un 0 o no y en funcion de eso entrar en el bucle
        
        while (numeroSillas !=0){
            boolean contadorI = false;
        boolean contadorD = false;
        String combinacion = sc.nextLine();
        
        for (int i = 0; i < combinacion.length(); i++){
         if (combinacion.charAt(i)=='I'){
         contadorI = true;
         }
         if (combinacion.charAt(i)=='D'){
         contadorD = true;
         }
        }
        if (contadorI && contadorD){
        System.out.println ("ALGUNO NO COME");
        }
        else System.out.println ("TODOS COMEN");

        numeroSillas = sc.nextInt();
        }
                
                
        
    }
     
     
}
