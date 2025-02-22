/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.java;
import java.util.Scanner;

/**
 *
 * @author SamKarsa
 */
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
//2.
//2.1  Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas.
/*
        // Hacemos el array 
        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        // Convertimos todas sus letras en mayusculas y las volvemos a guardar en el array e imprimimos 
        System.out.print("Usando for: ");
        for (int i=0; i<alfabeto.length; i++){
            alfabeto[i] = Character.toUpperCase(alfabeto[i]);
            System.out.print(alfabeto[i] + " ");
        }
        System.out.println();
        
        // Otra fomra de imprimir usando for-each
        System.out.print("Usando for-each: ");
        for (char c : alfabeto) {
            System.out.print(c + " ");
        }
*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//2.2 Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio
/*        
        //Declaramos las variables que vamos a usar
        int suma=0;
        float promedio=0;
    
        // Crear un arreglo con 100 edades predefinidas
        int[] edades = {
            21, 23, 19, 30, 25, 22, 28, 18, 26, 29,
            21, 24, 20, 29, 30, 22, 19, 27, 23, 28,
            18, 25, 30, 29, 20, 26, 27, 29, 22, 23,
            24, 30, 25, 28, 19, 30, 21, 27, 23, 29,
            20, 28, 22, 24, 19, 27, 30, 29, 21, 25,
            22, 28, 30, 27, 19, 29, 20, 24, 25, 18,
            22, 28, 23, 21, 29, 19, 30, 24, 26, 28,
            21, 27, 23, 25, 30, 18, 20, 22, 29, 27,
            24, 30, 18, 23, 26, 22, 19, 28, 21, 25,
            27, 30, 29, 24, 28, 19, 23, 21, 26, 25
        };
        
        for (int i : edades){
            suma += edades[i];
        };
        promedio = suma/edades.length;  
        
        System.out.println("Este es el promedio: "+promedio);
*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//2.3 Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Cálculo.

/*
        //Declaramos las variables
        double suma=0;
        double promedio=0;
        
        // Declaración e inicialización del vector con 7 notas
        double[] notas = {8.5, 7.0, 9.2, 6.8, 7.5, 8.0, 9.0};
        
        for( int i=0; i<notas.length; i++){
            suma += notas[i];
        };
        
        promedio = suma/notas.length;
        System.out.println("Este es el promedio: "+promedio);
*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//2.4










        scanner.close(); 
    }
}
