/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sistemas G Didactic
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        double edad_total = 0;
        double estatura;
        double estatura_total = 0;
        int iterar_informacion;
        String informe = "";
        String edades = "";
        

        System.out.println("Ingrese la cantidad de jugadores");
        iterar_informacion = entrada.nextInt();
        entrada.nextLine();

        for (int i = 1; i <= iterar_informacion; i++) {
            entrada.nextLine();
            System.out.println("Ingrese en nombre del jugador");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la posición en el campo de juego");
            posicion = entrada.nextLine();
            
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            
            edades = edades + edad + " ";
            edad_total = edad_total + edad ;
            estatura_total = estatura_total + estatura;
            informe = informe + i + ". " + nombre + " -" + posicion + 
                    "-, edad " + edad + ", estatura "+ estatura + "\n";
            

        }
        edad_total = edad_total / iterar_informacion;
        estatura_total = estatura_total / iterar_informacion;

        System.out.printf("Listado de Jugadores\n\n%sListado de edades %sPromedio de edades:%.2f "
                + "Promedio de estaturas:%.2f", 
                informe,
                edades,
                edad_total,
                estatura_total);

    }

}
