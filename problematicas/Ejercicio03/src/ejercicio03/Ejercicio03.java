/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fahrenheit = 20;
        double celsius = 0;
        int contador;
        String informe = "";
        informe = informe + "F°\tC°\n";

        for (contador = 1; contador <= 20; contador ++) {
            celsius = (fahrenheit - 32) * 5/9;
            informe = String.format("%s%.2f\t%.2f\n", 
                    informe,
                    fahrenheit, 
                    celsius);

            fahrenheit += 4;
        }
        System.out.println(informe);
    }

}