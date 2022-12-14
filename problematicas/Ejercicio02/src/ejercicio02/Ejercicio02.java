/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero = 25;
        int numero2;
        int numero3;
        int numero4;
        int contador;
       
        String informe = "";
        informe = informe + "#\tx2\tx3\tx4\n";

        for(contador = 25; contador >= 1; contador --){
            numero2 = numero * 2;
            numero3 = numero * 3;
            numero4 = numero * 4;
            informe = String.format("%s%d\t%d\t%d\t%d\n", 
                    informe,
                    numero, 
                    numero2, 
                    numero3, 
                    numero4);
            
        }
        System.out.println(informe);
        
        
    }
    
}
